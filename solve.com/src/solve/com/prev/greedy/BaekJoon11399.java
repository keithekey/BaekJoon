package solve.com.prev.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon11399 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] ppl = new int[n];
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			ppl[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(ppl);
		
		for(int j = 0; j < n; j++) {
			for(int k = 0; k <= j; k++) {
				sum += ppl[j - k];
			}
		}
		
		System.out.print(sum);
		
	}
	
}