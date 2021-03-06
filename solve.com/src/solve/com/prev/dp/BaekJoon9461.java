package solve.com.prev.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon9461 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    int T = Integer.parseInt(br.readLine());
	    int[] tArr = new int[T];
	    int max = 0;
	    
	    for(int i = 0; i < T; i++) {
	    	tArr[i] = Integer.parseInt(br.readLine());
	    	if(tArr[i] > max) {
	    		max = tArr[i];
	    	}
	    }
	    
	    if(max <= 3) {
	    	System.out.print("1");
	    	return;
	    }
	    
	    long[] pArr = new long[max + 1];
	    pArr[1] = 1;
	    pArr[2] = 1;
	    pArr[3] = 1;
	    
	    for(int j = 4; j <= max; j++) {
	    	pArr[j] = pArr[j - 2] + pArr[j - 3];
	    }
	    
	    for(int k = 0; k < T; k++) {
	    	bw.write(pArr[tArr[k]] + "\n");
	    }
	    
	    bw.flush();
	    br.close();
	    
	}
}