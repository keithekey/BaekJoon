package solve.com.prev.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class __BaekJoon1406 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strDefault = br.readLine(); //기본 문자열
		int rep = Integer.parseInt(br.readLine()); //입력받을 횟수
		StringBuilder sb = new StringBuilder();
		
		Stack<String> stL = new Stack<String>();
		Stack<String> stR = new Stack<String>();
		
		for(int i = 0; i < strDefault.length(); i++) {
			stL.push(Character.toString(strDefault.charAt(i)));
		}
		
		for(int j = 0; j < rep; j++) {
			
			String s = br.readLine();
			
			if(s.equals("L")) { //커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시)
				if(!stL.isEmpty()) { //왼쪽 스택이 비어있지 않으면 (커서가 맨 앞이 아니면)
					stR.push(stL.pop()); //왼쪽 스택을 pop해서 오른쪽 스택에 push
				}
				continue;
			}
			
			if(s.equals("D")) { //커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시)
				if(!stR.isEmpty()) { //오른쪽 스택이 비어있지 않으면 (커서가 맨 뒤가 아니면)
					stL.push(stR.pop()); //오른쪽 스택을 pop해서 왼쪽 스택에 push
				}
				continue;
			}
			
			if(s.equals("B")) { //커서 왼쪽의 문자 삭제 (커서가 문장의 맨 앞이면 무시)
				if(!stL.isEmpty()) { //왼쪽 스택이 비어있지 않으면 (커서가 맨 앞이 아니면)
					stL.pop(); //왼쪽 스택에서 pop
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