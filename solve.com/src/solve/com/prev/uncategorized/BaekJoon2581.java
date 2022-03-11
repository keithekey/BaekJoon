package solve.com.prev.uncategorized;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2581 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int cnt = 0;
		int sum = 0;
		int min = 0;
		
		for(int i = a; i <= b; i++) { //�� �� ������ �� ��ŭ �ݺ��ϸ�
			cnt = 0;
			
			if(i < 2) { //0�̳� 1�� ��� ����
				continue;
			}
			
			for(int k = 2; k < i; k++) { //1�� �ش��ϴ� ���� �����ϰ� �ش��ϴ� ������ ��������
				if(i != k && i % k == 0) { //�Ҽ��� �ƴ� ���
					cnt++;
					break;
				}
			}
			
			if(cnt == 0) {
				sum += i;
				if(min == 0) {
					min = i;
				} else {
					min = Math.min(min, i);
				}
			}
		}
		
		if(sum + min == 0) {
			System.out.println("-1");
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}