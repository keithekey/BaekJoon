package solve.com.prev.dataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String repeat = br.readLine();
		Stack<String> st = new Stack<String>();
		
		for(int i = 0; i < Integer.parseInt(repeat); i++) {
			String str = br.readLine();
			StringTokenizer stk = new StringTokenizer(str);
			
			String odr = stk.nextToken();
			
			if(odr.equals("push")) {
				st.push(stk.nextToken());
				continue;
			}
			
			if(odr.equals("pop")) {
				if(st.empty()) {
					bw.write("-1\n");
					continue;
				} else {
					bw.write(st.pop() + "\n");
					continue;
				}
			}
			
			if(odr.equals("size")) {
				bw.write(st.size() + "\n");
				continue;
			}
			
			if(odr.equals("empty")) {
				if(st.empty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
				continue;
			}
			
			if(odr.equals("top")) {
				if(st.empty()){
					bw.write("-1\n");
					continue;
				} else {
					bw.write(st.peek() + "\n");
					continue;
				}
			}
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}
	
}