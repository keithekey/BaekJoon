package solve.com.prev.uncat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1157 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int[] cnt = new int[26];
		int maxCh = 0;
		int maxVal = 0;
		boolean overlap = false;
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < 26; j++) {
				if(str.charAt(i) == (char)(j + 65) || str.charAt(i) == (char)(j + 97)) {
					cnt[j]++;
					break;
				}
			}
		}
		
		for(int k = 0; k < cnt.length; k++) {
			if(cnt[k] > maxVal) {
				maxCh = k;
				maxVal = cnt[k];
				cnt[k] = 0;
			}
		}
		
		for(int l = 0; l < cnt.length; l++) {
			if(maxVal == cnt[l]) {
				overlap = true;
			}
		}
		
		if(overlap) {
			System.out.print("?");
		} else {
			System.out.print((char)(maxCh + 65));
		}
		
	}

}