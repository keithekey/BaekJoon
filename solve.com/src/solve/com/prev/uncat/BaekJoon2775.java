package solve.com.prev.uncat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2775 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int rep = Integer.parseInt(br.readLine());
		
		int[][] aptArr = new int[15][15]; //아파트의 층, 호수를 이중배열로 나타냄
		
		for(int i = 0; i < aptArr.length; i++) { //층
			for(int j = 1; j < aptArr.length; j++) { //호
				if(i == 0) { 					//0층일 경우
					aptArr[i][j] = j;			//각 호수에 해당하는 인원만큼 살고있음
					continue;
				}
				
				if(j == 1) {					//각 층의 1호일 경우
					aptArr[i][j] = 1;			//1명만 살고 있음
					continue;
				}
				
				aptArr[i][j] = aptArr[i - 1][j] + aptArr[i][j - 1];
			}
		}
		
		for(int k = 0; k < rep; k++) {
			bw.write(aptArr[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine())] + "\n");
		}
		
		bw.flush();
		br.close();
		
	}
}