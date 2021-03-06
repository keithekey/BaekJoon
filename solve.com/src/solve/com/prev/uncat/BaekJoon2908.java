package solve.com.prev.uncat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2908 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.print(Math.max(reverseNum(a), reverseNum(b)));
		
		
	}
	
	public static int reverseNum(int i) {
		int res = 0;
		int digit = 2;
		
		while(i != 0) {
			res += (i % 10) * digitCalc(digit);
			digit--;
			i /= 10;
		}
		
		return res;
	}
	
	public static int digitCalc(int i) {
		int res = 1;
		
		for(int j = 0; j < i; j++) {
			res *= 10;
		}
		
		if(i == 0) {
			return 1;
		} else {
			return res;
		}
	}

}