package solve.com.prev.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _BaekJoon9184 {
	
	static int wArr[][][] = new int[21][21][21];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == -1 && b == -1 && c == -1) {
				break;
			}
			
			bw.write("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c) + "\n");
		}
		
		bw.flush();
		br.close();
	}	
	
	public static int w(int a, int b, int c) {
		if(a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		
		if(a > 20 || b > 20 || c > 20) {
			return w(20, 20, 20);
		}
		
		if(a < b && b < c) {
			if(wArr[a][b][c] != 0) {
				return wArr[a][b][c];
			} else {
				return wArr[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
			}
		}
		
		if(wArr[a][b][c] != 0) {
			return wArr[a][b][c];
		} else {
			return wArr[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
		}
	}
	
}