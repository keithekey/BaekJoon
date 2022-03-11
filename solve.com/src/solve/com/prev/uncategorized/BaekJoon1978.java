package solve.com.prev.uncategorized;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1978 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int rep = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num = new int[rep];
		
		for(int i = 0; i < rep; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int j = 0; j < num.length; j++) { //�Է¹��� �� ������ŭ �ݺ�
			
			if(num[j] < 2) { //0�̳� 1�� ��� ����
				rep--;
				continue;
			}
			
			for(int k = 2; k < num[j]; k++) { //1�� �ش��ϴ� ���� �����ϰ� �ش��ϴ� ������ ��������
				
				
				if(num[j] != k && num[j] % k == 0) {
					rep--;
					break;
				}
			}
		}
		
		System.out.println(rep);

	}

}
