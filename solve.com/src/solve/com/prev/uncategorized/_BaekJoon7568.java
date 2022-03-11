package solve.com.prev.uncategorized;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _BaekJoon7568 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int rep = Integer.parseInt(br.readLine());
		int[][] ppl = new int[rep][2]; 
		
		for(int i = 0;  i < rep; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			ppl[i][0] = Integer.parseInt(st.nextToken()); 
			ppl[i][1] = Integer.parseInt(st.nextToken()); 
		}
		
		for(int j = 0; j < rep; j++) {
			int rank = 1;
			
			for(int k = 0; k < rep; k++) {
				if(j == k) { 
					continue;
				} else {
					if(ppl[j][0] < ppl[k][0] && ppl[j][1] < ppl[k][1]) {
						rank++;
					}
				}
			}
			
			System.out.print(rank + " ");
		}

	}

}
