package solve.com.prev.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1003 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int rep = Integer.parseInt(br.readLine()); //n?? ?ݺ?
		int inputNums[] = new int[rep];
		int max = 0;
		
		for(int i = 0; i < rep; i++) {
			inputNums[i] = Integer.parseInt(br.readLine());
			if(inputNums[i] > max) {
				max = inputNums[i];
			}
		}
		
		int fiboArr[] = new int[max + 1];
		fiboArr[0] = 0;
		fiboArr[1] = 1;
		
		for(int k = 2; k <= max; k++) {
			fiboArr[k] = fiboArr[k - 1] + fiboArr[k - 2];
		}
		
		for(int j = 0; j < rep; j++) {
			if(inputNums[j] == 0) {
				sb.append("1 0\n");
				continue;
			}
			
			if(inputNums[j] == 1) {
				sb.append("0 1\n");
				continue;
			}
			sb.append(fiboArr[(inputNums[j] - 1)] + " " + fiboArr[inputNums[j]] + "\n");
		}
		
		System.out.print(sb);
	}	
	
}