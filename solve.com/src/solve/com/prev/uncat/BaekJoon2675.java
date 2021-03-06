package solve.com.prev.uncat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon2675 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int rep = Integer.parseInt(br.readLine());
		String[][] dat = new String[rep][2];
		
		for(int i = 0; i < dat.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			dat[i][0] = st.nextToken();
			dat[i][1] = st.nextToken();
		}
		
		for(int j = 0; j < dat.length; j++) {
			for(int k = 0; k < dat[j][1].length(); k++) {
				for(int l = 0; l < Integer.parseInt(dat[j][0]); l++) {
					bw.write(dat[j][1].charAt(k));
				}
			}
			if(j + 1 == dat.length) {
				continue;
			} else {
				bw.write("\n");
			}
		}
		
		bw.flush();
		
	}

}