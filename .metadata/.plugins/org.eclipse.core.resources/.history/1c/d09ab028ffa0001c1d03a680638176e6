package solve.com.prev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1316 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int rep = Integer.parseInt(br.readLine());
		String[] str = new String[rep];
		int res = 0;
		
		
		for(int i = 0; i < rep; i++) {
			str[i] = br.readLine();
		}
		
		for(int j = 0; j < str.length; j++) {
			if(isGroupWord(str[j])) {
				res++;
			}
		}
		
		System.out.print(res);
		
	}
	
	public static boolean isGroupWord(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			
			while(true) {
				if(i + 1 == str.length()) {
					break;
				}
				
				if(str.charAt(i) != str.charAt(i + 1)) {
					break;
				}
				i++;
			}
			
			for(int j = i + 1; j < str.length(); j++) {
				if(j == str.length()) {
					break;
				}
				
				if(str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		
		return true;
	}
	
}