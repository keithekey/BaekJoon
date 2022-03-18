package solve.com.prev.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon13305 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cities = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()); //���ð� �Ÿ�
		StringTokenizer stk = new StringTokenizer(br.readLine()); //���ú� ����
		int d[] = new int[cities - 1];	//���ð� �Ÿ�
		int p[] = new int[cities]; //���ú� ����

		for(int i = 0; i < cities; i++) {
			if(!st.hasMoreTokens()) {
				p[i] = Integer.parseInt(stk.nextToken());
				break;
			}
			d[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(stk.nextToken());
		}
		
		if(cities <= 2) {	//���� ���� 2�� ������ ��� ����� ���� 1��
			System.out.print(d[0] * p[0]);
			return;
		}
		
		long curD = d[0]; //���� �Ÿ�
		long curP = p[0]; //���� ����
		long res = 0; //�����
		
		for(int j = 1; j < cities - 1; j++) { //������ ������ ������ ��� �ش���� �����Ƿ� ���ü� - 1 ��ŭ �ݺ�
			if(curP > p[j]) { //�̹� ������ ������ ���ݱ��� ���� �����ߴ� ������ ���ݺ��� �� ������ ���
				res += curP * curD;	//���ݱ��� ���ߴ� �Ÿ� * ���ݱ��� ���� �����ߴ� ������ ������ ������� ������
				curD = d[j];		
				curP = p[j];		
				continue;
			}
			
			curD += d[j];
		}
		
		res += curP * curD;
		System.out.print(res);
		
	}
	
}