package solve.com.prev.uncategorized;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1065 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		boolean isHansu[] = new boolean[num + 1];
		int res = 0;
		
		for(int i = 1; i < isHansu.length; i++) {
			if(i < 100) {
				isHansu[i] = true; //100 이하의 수는 전부 한수
			} else {
				isHansu[i] = false; //100 이상의 수는 전부 한수가 아닌 것으로 일단 처리
			}
		}
		
		for(int j = 100; j < isHansu.length; j++) {
			if(chkHansu(j)) {
				isHansu[j] = true;
			}
		}
		
		for(int k = 1; k < isHansu.length; k++) {
			if(isHansu[k]) {
				res++;
			}
		}
		
		System.out.print(res);
		
	}
	
	public static boolean chkHansu(int i) {
		int[] nums = new int[3];
		
		if(i == 1000) {
			return false;
		}
		
		for(int j = 0; j < nums.length; j++) {
			nums[j] = i % 10;
			i /= 10;
		}
		
		if(nums[2] - nums[1] == nums[1] - nums[0]) {
			return true;
		} else {
			return false;
		}
		
	}
}
