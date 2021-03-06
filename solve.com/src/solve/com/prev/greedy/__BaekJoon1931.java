package solve.com.prev.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class __BaekJoon1931 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] timetable = new int[n][2];
		int res = 0;
		int curTime = 0;
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			timetable[i][0] = Integer.parseInt(st.nextToken()); //시작 시간
			timetable[i][1] = Integer.parseInt(st.nextToken()); //종료 시간
		}
		
		Arrays.sort(timetable, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) { //종료시간 기준으로 정렬
				if(o1[1] == o2[1]) { //종료시간이 같다면
					return o1[0] - o2[0]; //시작시간 오름차순 정렬
				} else {			 //같지 않다면
					return o1[1] - o2[1]; //종료시간 오름차순 정렬
				}
			}
		});
		
		for(int j = 0; j < n; j++) {
			
			if(timetable[j][0] >= curTime) {
				res++;
				curTime = timetable[j][1];
			}
			
		}
		
		System.out.println(res);
		
	}
	
}