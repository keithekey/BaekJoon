package solve.com.prev.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon10773 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int num = 0;
		int res = 0;
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < n; i++) {
			num = Integer.parseInt(br.readLine());
			
			if(num == 0 && !stack.isEmpty()) {
				stack.pop();
				continue;
			}
			
			stack.push(num);
		}
		
		while(!stack.isEmpty()) {
			res += stack.pop();
		}
		
		System.out.print(res);
	}
	
}