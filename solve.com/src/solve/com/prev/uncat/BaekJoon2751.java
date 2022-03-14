package solve.com.prev.uncat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon2751 {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int rep = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		for(int i = 0; i < rep; i++) {
			arrList.add(i, Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arrList);
		
		for(int j = 0; j < arrList.size(); j++) {
			sb.append(arrList.get(j)).append("\n");
		}
		
		System.out.println(sb);
	}

}
