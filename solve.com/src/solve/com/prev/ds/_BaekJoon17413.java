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
		
		
		
		while(!(idx == str.length())) { //문자열 길이만큼 반복
			if(str.charAt(idx) == '<') {	  //태그를 열었을때
				
				while(!(str.charAt(idx) == '>')) { //태그가 닫힐때까지 반복
					sb.append(str.charAt(idx));    //해당 index에 해당하는 문자를 문자열에 추가
					idx++;
				}
				sb.append(str.charAt(idx));		  //닫힘 괄호 추가
				idx++;
				continue;
				
			} else {
				
				if(str.charAt(idx) == ' ') {		//해당 인덱스의 문자가 공백일경우
					sb.append(str.charAt(idx));		//문자열에 추가 후 다음 인덱스로
					idx++;
				}
				
				while(!(idx == str.length())) { 	//입력받은 문자열의 길이를 초과하는 경우 반복 중지
					if(str.charAt(idx) == '<' || str.charAt(idx) == ' ') { //태그가 열리거나 공백이 나오기 전까지 모든 문자를 스택에 담음
						break;
					}
					stack.push(str.charAt(idx)); //스택에 문자 추가ㅣ
					idx++;
				}
					
				while(!stack.isEmpty()) { //스택에 추가한 문자들을 스트링빌더에 추가
					sb.append(stack.pop());
				}
				
			}
		}
		
		System.out.print(sb);
		
	}	
	
}