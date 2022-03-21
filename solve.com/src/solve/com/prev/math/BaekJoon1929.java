package solve.com.prev.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon1929 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		boolean res = false;
		
		boolean isPrime[] = new boolean[n + 1];
		Arrays.fill(isPrime, false);
		
		for(int i = 2; i < isPrime.length; i++) {
			res = true;
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(isPrime[j] == false) {
					continue;
				}
				
				if(i % j == 0) {
					res = false;
					break;
				}
			}
			
			if(res) {
				isPrime[i] = true;
			}
		}
		
		for(int k = m; k < isPrime.length; k++) {
			if(isPrime[k]) {
				bw.write(k + "\n");
			}
		}
		
		bw.flush();
		
	}
	
}