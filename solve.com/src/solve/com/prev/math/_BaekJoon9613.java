package solve.com.prev.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _BaekJoon9613 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		int[] arr = new int[100];
		int n = 0;
		long sum = 0;
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			
			for(int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			sum = 0;
			
			for(int k = 0; k < n; k++) {
				for(int l = k + 1; l < n; l++) {
					sum += getGcd(Math.max(arr[k], arr[l]), Math.min(arr[k], arr[l]));
				}
			}
			
			bw.write(sum + "\n");
		}
		
		br.close();
		bw.flush();

	}
	
	public static int getGcd(int p, int q) {

		if (q == 0) return p;
		return getGcd(q, p%q);
	}
	
}