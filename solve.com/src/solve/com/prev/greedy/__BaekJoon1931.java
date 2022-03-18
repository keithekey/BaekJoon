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
			timetable[i][0] = Integer.parseInt(st.nextToken()); //���� �ð�
			timetable[i][1] = Integer.parseInt(st.nextToken()); //���� �ð�
		}
		
		Arrays.sort(timetable, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) { //����ð� �������� ����
				if(o1[1] == o2[1]) { //����ð��� ���ٸ�
					return o1[0] - o2[0]; //���۽ð� �������� ����
				} else {			 //���� �ʴٸ�
					return o1[1] - o2[1]; //����ð� �������� ����
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