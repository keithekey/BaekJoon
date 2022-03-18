package solve.com.prev.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon1339 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //�ݺ� Ƚ��
		String[] in = new String[n];
		int[] digitArr = new int[26];
		int curM = 9;
		int sum = 0;

		for(int i = 0; i < n; i++) {
			in[i] = br.readLine();
		}
		
		for(int j = 0; j < n; j++) {					//�Է¹��� �ܾ� ����ŭ �ݺ�
			for(int k = 0; k < in[j].length(); k++) {	//�� ���ڿ��� ���̸�ŭ �ݺ�
				digitArr[(int)in[j].charAt(in[j].length() - (k + 1)) - 65] += digits(k + 1);
			}
		}
		
		Arrays.sort(digitArr);
		
		for(int l = 1; l <= 26; l++) {
			if(digitArr[26 - l] == 0) {
				break;
			}
			sum += digitArr[26 - l] * curM;
			curM--;
		}
		
		System.out.print(sum);
		
	}
	
	public static int digits(int i) {
		if(i < 2) {
			return i;
		}
		int res = 1;
		for(int j = 1; j < i; j++) {
			res *= 10;
		}
		
		return res;
	}
	
}