package solve.com.prev.uncat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2231 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num  = br.readLine(); //입력값 1 ≤ N ≤ 1,000,000
		
		int res = 0; //결과값
		
		for(int i = 1; i <= Integer.parseInt(num); i++) {
			int a = i / 1000000;
			int b = i / 100000 - a * 10;
			int c = i / 10000 - a * 100 - b * 10;
			int d = i / 1000 - a * 1000 - b * 100 - c * 10;
			int e = i / 100 - a * 10000 - b * 1000 - c * 100 - d * 10;
			int f = i / 10 - a * 100000 - b * 10000 - c * 1000 - d * 100 - e * 10;
			int g = i / 1 - a * 1000000 - b * 100000 - c * 10000 - d * 1000 - e * 100 - f * 10;
			
			if(i + a + b + c + d + e + f + g == Integer.parseInt(num)) {
				if(res == 0) {
					res = i;
				} else {
					res = Math.min(i, res);
				}
			}
		}
		
		System.out.println(res);

	}

}
