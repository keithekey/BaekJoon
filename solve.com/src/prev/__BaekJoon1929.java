import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class __BaekJoon1929 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		boolean[] isPrime = new boolean[b + 1];
		
		isPrime[0] = true; //0과 1은 소수에서 제외
		isPrime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(isPrime.length); i++) {
			if(isPrime[i]) {
				continue;
			}
			
			for(int j = i * i; j < isPrime.length; j += i) {
				isPrime[j] = true;
			}
		}
		
		for(int k = a; k < isPrime.length; k++) {
			if(!isPrime[k]) {
				System.out.println(k);
			}
		}
	}

}
