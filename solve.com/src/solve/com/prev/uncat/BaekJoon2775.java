package solve.com.prev.uncat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2775 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int rep = Integer.parseInt(br.readLine());
		
		int[][] aptArr = new int[15][15]; //����Ʈ�� ��, ȣ���� ���߹迭�� ��Ÿ��
		
		for(int i = 0; i < aptArr.length; i++) { //��
			for(int j = 1; j < aptArr.length; j++) { //ȣ
				if(i == 0) { 					//0���� ���
					aptArr[i][j] = j;			//�� ȣ���� �ش��ϴ� �ο���ŭ �������
					continue;
				}
				
				if(j == 1) {					//�� ���� 1ȣ�� ���
					aptArr[i][j] = 1;			//1���� ��� ����
					continue;
				}
				
				aptArr[i][j] = aptArr[i - 1][j] + aptArr[i][j - 1];
			}
		}
		
		for(int k = 0; k < rep; k++) {
			bw.write(aptArr[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine())] + "\n");
		}
		
		bw.flush();
		br.close();
		
	}
}