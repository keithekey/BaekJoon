package solve.com.prev.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _BaekJoon10799 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		Stack<Character> stack = new Stack<Character>();
		int res = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(i < str.length() - 1) {
				if(str.charAt(i) == '(' && str.charAt(i + 1) == ')') { //레이저 발사.
					res += stack.size();
					i++;
					continue;
				}
			}
			
			if(str.charAt(i) == '(') {
				stack.push('(');
				continue;
			} else {
				stack.pop();
				res++;
			}
		}
		
		System.out.print(res);
		
	}	
	
}
