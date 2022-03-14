package solve.com.prev.uncategorized;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2941 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == 'c' && i + 1 != str.length()) { //c=, c-
				if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
					i++;
				}
			}
			
			if(str.charAt(i) == 'd' && i + 1 != str.length() && i + 2 != str.length()) { //dz=
				if(str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
					i += 2;
				}
			}
			
			if(str.charAt(i) == 'd' && i + 1 != str.length()) { //d-
				if(str.charAt(i + 1) == '-') {
					i++;
				}
			}
			
			if(str.charAt(i) == 'l' && i + 1 != str.length()) { //lj
				if(str.charAt(i + 1) == 'j') {
					i++;
				}
			}
			
			if(str.charAt(i) == 'n' && i + 1 != str.length()) { //nj
				if(str.charAt(i + 1) == 'j') {
					i++;
				}
			}
			
			if(str.charAt(i) == 's' && i + 1 != str.length()) { //s=
				if(str.charAt(i + 1) == '=') {
					i++;
				}
			}
			
			if(str.charAt(i) == 'z' && i + 1 != str.length()) { //z=
				if(str.charAt(i + 1) == '=') {
					i++;
				}
			}
			
			res++;
		}
		
		System.out.print(res);
		
	}
	
}