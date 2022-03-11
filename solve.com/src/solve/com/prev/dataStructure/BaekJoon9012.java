package solve.com.prev.dataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BaekJoon9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int rep = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < rep; i++) {
			String str = br.readLine();
			Stack<String> st = new Stack<String>();
			
			for(int j = 0; j < str.length(); j++) { //�Է¹��� ���� ���ڼ���ŭ �ݺ�
				if(j + 1 == str.length()) { //������ �ݺ��� ���
					if(st.size() == 1 && str.charAt(j) == ')') { //���ÿ� �Ѱ��� �����ְ� ������ �ݺ��� �ݴ� ��ȣ�� ���
						bw.write("YES\n");
						break;
					} else {
						bw.write("NO\n");
						break;
					}
				}
				
				if(str.charAt(j) == '(') { 	//���� ��ȣ�� ���
					st.push("0"); 			//���ÿ� 0�� �߰�
					continue;
				} else {					//�ݴ� ��ȣ�� ���
					if(st.empty()) {		//������ ����ִٸ�
						bw.write("NO\n");	//�ùٸ��� ���� ���ڿ�
						break;				//�ݺ� ����
					} else {				//������ ������� �ʴٸ�
						st.pop();			//���ÿ��� �Ѱ� ����
					}
				}
			}
		}
		
		bw.flush();
		
	}	
	
}