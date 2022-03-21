package solve.com.prev.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon1934 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int gcd = ea(Math.max(a, b), Math.min(a, b));
			int lcm = a * b / gcd;
			
			bw.write(lcm + "\n");
		}
		
		bw.flush();
		
	}
	
	public static int ea(int a, int b) {
		
		int r = a % b;
		
		if(r == 0) {
			return b;
		}
		
		return ea(b, r);
	}
	
}