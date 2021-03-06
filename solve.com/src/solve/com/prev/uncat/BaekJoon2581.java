package solve.com.prev.uncat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2581 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int cnt = 0;
		int sum = 0;
		int min = 0;
		
		for(int i = a; i <= b; i++) { //두 수 사이의 수 만큼 반복하며
			cnt = 0;
			
			if(i < 2) { //0이나 1인 경우 제외
				continue;
			}
			
			for(int k = 2; k < i; k++) { //1과 해당하는 수를 제외하고 해당하는 수까지 나눠보기
				if(i != k && i % k == 0) { //소수가 아닌 경우
					cnt++;
					break;
				}
			}
			
			if(cnt == 0) {
				sum += i;
				if(min == 0) {
					min = i;
				} else {
					min = Math.min(min, i);
				}
			}
		}
		
		if(sum + min == 0) {
			System.out.println("-1");
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
