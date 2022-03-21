package solve.com.prev.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _BaekJoon1676 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int res = 0;
		
		while(n >= 5) {
			res += n / 5;
			n /= 5;
		}
		
		System.out.print(res);
	}
	
}