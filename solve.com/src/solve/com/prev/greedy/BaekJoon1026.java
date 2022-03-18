package solve.com.prev.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon1026 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //¹Ýº¹ È½¼ö
		int a[] = new int[n];
		int b[] = new int[n];
		int sum = 0;
		
		StringTokenizer strA = new StringTokenizer(br.readLine());
		StringTokenizer strB = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(strA.nextToken());
			b[i] = Integer.parseInt(strB.nextToken());
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int j = 0; j < n; j++) {
			sum += a[j] * b[n - (j + 1)];
		}
		
		System.out.print(sum);
		
	}
	
}