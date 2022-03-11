package solve.com.prev.uncategorized;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1978 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int rep = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num = new int[rep];
		
		for(int i = 0; i < rep; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int j = 0; j < num.length; j++) { //입력받은 수 갯수만큼 반복
			
			if(num[j] < 2) { //0이나 1인 경우 제외
				rep--;
				continue;
			}
			
			for(int k = 2; k < num[j]; k++) { //1과 해당하는 수를 제외하고 해당하는 수까지 나눠보기
				
				
				if(num[j] != k && num[j] % k == 0) {
					rep--;
					break;
				}
			}
		}
		
		System.out.println(rep);

	}

}
