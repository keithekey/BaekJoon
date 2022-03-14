package solve.com.prev.uncategorized;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BaekJoon4673 {
	

		public static void main(String[] args) throws IOException {
			
			BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
			boolean[] isSelfNum = new boolean[10001];
			
			for(int a = 1; a <= 10000; a++) {
				isSelfNum[a] = true;
			}
			
			int sum = 0;
			
			for(int i = 1; i <= isSelfNum.length; i++) {
				sum = makeSum(i);
				
				if(sum <= 10000) {
					isSelfNum[sum] = false;
				}

			}

			for(int j = 1; j < isSelfNum.length; j++) {
				if(isSelfNum[j]) {
					br.write(j + "\n");
				}
			}
			
			br.flush();
			br.close();
		}
		
		public static int makeSum(int i) {
			int res = i;
			
			while(i != 0) {
				res += i % 10;
				i /= 10;
			}
			
			return res;
		}
		
}
