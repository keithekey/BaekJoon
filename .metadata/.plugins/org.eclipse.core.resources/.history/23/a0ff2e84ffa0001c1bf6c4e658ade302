package solve.com.prev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class __BaekJoon1874 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int start = 0;
		
		int rep = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = 0; i < rep; i++) {
			int value = Integer.parseInt(br.readLine());
			
			if(value > start) {
				//start + 1 부터 입력받은 value까지 push
				for(int j = start + 1; j <= value; j++) {
					
					st.push(j);
					sb.append("+\n");
				}
				start = value; // 다음 push할 때의 오름차순을 유지하기 위한 변수 초기화
			} else if(st.peek() != value) { //입력받은 원소와 top의 값이 같지 않을 경우
				System.out.print("NO");
				return;
			}
			
			st.pop();
			sb.append("-\n");
		}
		
		System.out.println(sb);
		br.close();
		
		
	}	
	
}
