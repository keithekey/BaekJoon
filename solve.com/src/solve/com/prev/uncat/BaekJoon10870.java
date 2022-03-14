package solve.com.prev.uncat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10870 {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] fiboArr = new int[21];
		fiboArr[0] = 0;
		fiboArr[1] = 1;
		
		for(int i = 2; i < fiboArr.length; i++) {
			fiboArr[i] = fiboArr[i - 2] + fiboArr[i - 1];
		}
		
		System.out.print(fiboArr[Integer.parseInt(br.readLine())]);
	}

}
