package solve.com.prev.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _BaekJoon17087 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); //동생의 수
		int s = Integer.parseInt(st.nextToken()); //현재 위치
		int[] d = new int[n]; 			  //현재 위치부터 동생까지의 거리
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			d[i] = getD(s, Integer.parseInt(st.nextToken()));
		}
		
		if(n == 1) {
			System.out.print(d[0]);
			return;
		}
		
		int gcd = getGcd(d[0], d[1]);
		
		for(int i = 2; i < n; i++) {
			gcd = getGcd(gcd, d[i]);
		}
		
		System.out.print(gcd);
		
	}
	
	public static int getGcd(int p, int q) {
		if (q == 0) return p;
		return getGcd(q, p%q);
	}
	
	public static int getD(int a, int b) {
		return Math.max(a, b) - Math.min(a, b);
	}
	
}