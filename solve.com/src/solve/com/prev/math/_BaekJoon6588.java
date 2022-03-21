package solve.com.prev.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class _BaekJoon6588 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean res = false;
		
		boolean isPrime[] = new boolean[1000001];
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
		
		int n = 0;
		int a = 0;
		int b = 0;
		
		while(true) {
			n = Integer.parseInt(br.readLine());
			if(n == 0) {
				break;
			}
			
			a = 3;
			b = n - 3;
			
			while(true) {
				if(isPrime[a] == true && isPrime[b] == true) {
					bw.write(n + " = " + a + " + " + b + "\n");
					break;
				}
				a += 2;
				b -= 2;
			}
			
		}
		
		bw.flush();
		
	}
	
}