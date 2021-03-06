package solve.com.prev.uncat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon10757 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		String a = st.nextToken();
		String b = st.nextToken();
		int maxLen = Math.max(a.length(), b.length());
		int[] aArr = new int[maxLen];
		int[] bArr = new int[maxLen];
		
		for(int i = a.length(), idx1 = 0; i > 0 ; i--, idx1++) {
			aArr[idx1] = Character.getNumericValue(a.charAt(i - 1));
		}
		
		for(int j = b.length(), idx2 = 0; j > 0 ; j--, idx2++) {
			bArr[idx2] = Character.getNumericValue(b.charAt(j - 1));
		}
		
		for(int k = 0; k < maxLen; k++) {
			sb.insert(0, (aArr[k] + bArr[k]) % 10);
			
			if(aArr[k] + bArr[k] >= 10 && k < maxLen - 1) { //각 자리수의 합이 10보다 크고 마지막 자리가 아닐때
				aArr[k + 1]++;
				continue;
			}
			
			if(aArr[k] + bArr[k] >= 10 && k == maxLen - 1) { //가장 큰 자리수의 합이 10을 넘을 때
				sb.insert(0, 1);							 //맨 앞에 1 추가
				break;
			}
		}
		
		System.out.print(sb);
	}
	
}