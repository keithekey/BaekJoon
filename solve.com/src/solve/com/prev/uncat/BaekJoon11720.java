package solve.com.prev.uncat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int rep = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int sum = 0;
		
		for(int i = 0; i < rep; i++) {
			sum += Character.getNumericValue(str.charAt(i));
		}
		
		System.out.print(sum);
	}

}