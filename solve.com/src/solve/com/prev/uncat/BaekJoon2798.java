package solve.com.prev.uncat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2798 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); //입력값
		StringTokenizer st = new StringTokenizer(str);
		
		int cards = Integer.parseInt(st.nextToken()); //카드의 수
		int num = Integer.parseInt(st.nextToken()); // 기준 숫자
		int max = 0;
		
		st = new StringTokenizer(br.readLine()); 
		
		int[] nums = new int[cards];
		
		for(int i = 0; i < cards; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int j = 0; j < cards; j++) {
			for(int k = 1; k < cards; k++) {
				if(j != k) {
					for(int l = 2; l < cards; l++) {
						if(j != l && k != l) {
							if((nums[j] + nums[k] + nums[l]) <= num && (nums[j] + nums[k] + nums[l]) > max) {
								max = nums[j] + nums[k] + nums[l];
							}
						}
					}
				}
			}
		}
		
		System.out.println(max);


	}

}
