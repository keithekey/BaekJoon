package solve.com.prev.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1212 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();	
		int tmp = 0;
		
		for(int i = 0; i < str.length(); i++) {
			tmp = Character.getNumericValue(str.charAt(i));
			sb.append(tmp / 4);
			tmp %= 4;
			sb.append(tmp / 2);
			tmp %= 2;
			sb.append(tmp);
		}
		
		str = sb.toString();
		if(str.equals("000")) {
			System.out.print("0");
			return;
		}
		
		if(str.startsWith("00")) {
			System.out.print(str.substring(2, str.length()));
		} else if(str.startsWith("0")) {
			System.out.print(str.substring(1, str.length()));
		} else {
			System.out.print(str);
		}
		
	}
	
}