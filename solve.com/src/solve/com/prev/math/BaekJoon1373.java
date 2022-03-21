package solve.com.prev.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1373 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		if(str.length() % 3 == 2) {
			str = "0" + str;
		}
		
		if(str.length() % 3 == 1) {
			str = "00" + str;
		}
		
		for(int i = 0; i < str.length(); i += 3) {
				sb.append(Character.getNumericValue(str.charAt(i)) * 4 
						+ Character.getNumericValue(str.charAt(i + 1)) * 2
						+ Character.getNumericValue(str.charAt(i + 2)));
			
		}
		
		System.out.print(sb);
		
	}
	
}