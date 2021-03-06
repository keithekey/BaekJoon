package solve.com.prev.uncat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10809 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] ch = new char[26];
		int[] idx = new int[26];
		
		for(int a = 0; a < ch.length; a++) {
			ch[a] = (char) (97 + a);
			idx[a] = -1;
		}
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = 97; j < 123; j++) {
				if(str.charAt(i) == (char)(j)) {
					if(idx[j - 97] != -1) {
						break;
					} else {
						idx[j - 97] = i;
					}
				}
			}
		}
		
		for(int k = 0; k < idx.length; k++) {
			if(k == idx.length - 1) {
				System.out.print(idx[k]);
				break;
			}
			System.out.print(idx[k] + " ");
		}
		
	}

}