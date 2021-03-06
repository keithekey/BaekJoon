package solve.com.prev.ds;

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
			
			for(int j = 0; j < str.length(); j++) { //입력받은 줄의 문자수만큼 반복
				if(j + 1 == str.length()) { //마지막 반복일 경우
					if(st.size() == 1 && str.charAt(j) == ')') { //스택에 한개가 남아있고 마지막 반복이 닫는 괄호일 경우
						bw.write("YES\n");
						break;
					} else {
						bw.write("NO\n");
						break;
					}
				}
				
				if(str.charAt(j) == '(') { 	//여는 괄호일 경우
					st.push("0"); 			//스택에 0을 추가
					continue;
				} else {					//닫는 괄호일 경우
					if(st.empty()) {		//스택이 비어있다면
						bw.write("NO\n");	//올바르지 않은 문자열
						break;				//반복 종료
					} else {				//스택이 비어있지 않다면
						st.pop();			//스택에서 한개 꺼냄
					}
				}
			}
		}
		
		bw.flush();
		
	}	
	
}