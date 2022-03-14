package solve.com.prev.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _BaekJoon17413 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = new String(br.readLine());
		int idx = 0;
		
		Stack<Character> stack = new Stack<Character>();
		
		
		
		while(!(idx == str.length())) { //���ڿ� ���̸�ŭ �ݺ�
			if(str.charAt(idx) == '<') {	  //�±׸� ��������
				
				while(!(str.charAt(idx) == '>')) { //�±װ� ���������� �ݺ�
					sb.append(str.charAt(idx));    //�ش� index�� �ش��ϴ� ���ڸ� ���ڿ��� �߰�
					idx++;
				}
				sb.append(str.charAt(idx));		  //���� ��ȣ �߰�
				idx++;
				continue;
				
			} else {
				
				if(str.charAt(idx) == ' ') {		//�ش� �ε����� ���ڰ� �����ϰ��
					sb.append(str.charAt(idx));		//���ڿ��� �߰� �� ���� �ε�����
					idx++;
				}
				
				while(!(idx == str.length())) { 	//�Է¹��� ���ڿ��� ���̸� �ʰ��ϴ� ��� �ݺ� ����
					if(str.charAt(idx) == '<' || str.charAt(idx) == ' ') { //�±װ� �����ų� ������ ������ ������ ��� ���ڸ� ���ÿ� ����
						break;
					}
					stack.push(str.charAt(idx)); //���ÿ� ���� �߰���
					idx++;
				}
					
				while(!stack.isEmpty()) { //���ÿ� �߰��� ���ڵ��� ��Ʈ�������� �߰�
					sb.append(stack.pop());
				}
				
			}
		}
		
		System.out.print(sb);
		
	}	
	
}