package solve.com.prev.ds;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BaekJoon5397 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		
		Stack<Character> stL = new Stack<Character>();
		Stack<Character> stR = new Stack<Character>();
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			
			while(!stL.isEmpty()) {
				stL.pop();
			}
			
			while(!stR.isEmpty()) {
				stR.pop();
			}
			
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '<') {
					if(stL.isEmpty()) {
						continue;
					}
					stR.push(stL.pop());
					continue;
				}
				
				if(str.charAt(j) == '>') {
					if(stR.isEmpty()) {
						continue;
					}
					stL.push(stR.pop());
					continue;
				}
				
				if(str.charAt(j) == '-') {
					if(stL.isEmpty()) {
						continue;
					}
					stL.pop();
					//stR.push(stL.pop());
					continue;
				}
				
				stL.push(str.charAt(j));
			}
			
			for(int k = 0; k < stL.size(); k++) {
				sb.append(stL.elementAt(k));
			}
			
			while(!stR.isEmpty()) {
				sb.append(stR.pop());
			}
			
			sb.append("\n");
		}
		
		bw.flush();
	}
	
}