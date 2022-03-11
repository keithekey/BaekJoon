package solve.com.prev.dataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon9093 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int rep = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < rep; i++) {
			
			String str = br.readLine();
			StringTokenizer stk = new StringTokenizer(str);
			
			while(stk.hasMoreTokens()) {
				Stack<String> st = new Stack<String>();
				String word = stk.nextToken();
				
				for(int j = 0; j < word.length(); j++) {
					st.push(Character.toString(word.charAt(j)));
				}
				
				for(int k = 0; k < word.length(); k++) {
					bw.write(st.pop());
				}
				
				bw.write(" ");
			}
			
			bw.write("\n");
			
		}
		
		bw.flush();
		
	}	
	
}