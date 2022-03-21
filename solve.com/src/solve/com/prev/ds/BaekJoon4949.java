package solve.com.prev.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon4949 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		while(true) {
			String str = br.readLine();
			
			if(str.equals(".")) {
				break;
			}
			
			while(!stack.isEmpty()) {
				stack.pop();
			}
			
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == '(' || str.charAt(i) == '[') {
					stack.push(str.charAt(i));
					continue;
				}
				
				if(str.charAt(i) == ')') {
					if(stack.size() == 0) {
						sb.append("no\n");
						break;
					}
					
					if(stack.peek() == '(') {
						stack.pop();
						continue;
					} else {
						sb.append("no\n");
						break;
					}
				}
				
				if(str.charAt(i) == ']') {
					if(stack.size() == 0) {
						sb.append("no\n");
						break;
					}
					
					if(stack.peek() == '[') {
						stack.pop();
						continue;
					} else {
						sb.append("no\n");
						break;
					}
				}
				
				if(i + 1 == str.length()) {
					if(stack.size() == 0) {
						sb.append("yes\n");
						break;
					} else {
						sb.append("no\n");
						break;
					}
				}
			}
		}
		
		System.out.print(sb);
		
	}
	
}