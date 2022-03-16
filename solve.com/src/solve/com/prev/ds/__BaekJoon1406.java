package solve.com.prev.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class __BaekJoon1406 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strDefault = br.readLine(); //�⺻ ���ڿ�
		int rep = Integer.parseInt(br.readLine()); //�Է¹��� Ƚ��
		StringBuilder sb = new StringBuilder();
		
		Stack<String> stL = new Stack<String>();
		Stack<String> stR = new Stack<String>();
		
		for(int i = 0; i < strDefault.length(); i++) {
			stL.push(Character.toString(strDefault.charAt(i)));
		}
		
		for(int j = 0; j < rep; j++) {
			
			String s = br.readLine();
			
			if(s.equals("L")) { //Ŀ���� �������� �� ĭ �ű� (Ŀ���� ������ �� ���̸� ����)
				if(!stL.isEmpty()) { //���� ������ ������� ������ (Ŀ���� �� ���� �ƴϸ�)
					stR.push(stL.pop()); //���� ������ pop�ؼ� ������ ���ÿ� push
				}
				continue;
			}
			
			if(s.equals("D")) { //Ŀ���� ���������� �� ĭ �ű� (Ŀ���� ������ �� ���̸� ����)
				if(!stR.isEmpty()) { //������ ������ ������� ������ (Ŀ���� �� �ڰ� �ƴϸ�)
					stL.push(stR.pop()); //������ ������ pop�ؼ� ���� ���ÿ� push
				}
				continue;
			}
			
			if(s.equals("B")) { //Ŀ�� ������ ���� ���� (Ŀ���� ������ �� ���̸� ����)
				if(!stL.isEmpty()) { //���� ������ ������� ������ (Ŀ���� �� ���� �ƴϸ�)
					stL.pop(); //���� ���ÿ��� pop
				}
				continue;
			}
			
			StringTokenizer st = new StringTokenizer(s);
			if(st.nextToken().equals("P")) {
				stL.push(st.nextToken());
			}
			
		}
		
		while(!stL.isEmpty()) {
			stR.push(stL.pop());
		}
		
		while(!stR.isEmpty()) {
			sb.append(stR.pop());
		}
		
		System.out.print(sb);
		
	}	
	
}