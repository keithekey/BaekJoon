package solve.com.prev.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _BaekJoon1158 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(stk.nextToken()); //반복할 횟수
		int b = Integer.parseInt(stk.nextToken()); //b번째 사람 제거
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 1; i <= a; i++) {//Queue에 a까지의 모든 숫자 넣기
			queue.offer(i);
		}
		
		sb.append("<");
		
		while(queue.size() > 1) { //숫자가 1개 남을 때까지 반복
			
			for(int j = 1; j <= b; j++) { //b번째 사람 제거
				if(j == b) {
					sb.append(queue.poll() + ", ");
				} else {
					queue.offer(queue.poll());
				}
			}
		}
		
		sb.append(queue.poll() + ">"); //숫자가 한개 남았을 때 콤마 없이 마무리
		
		System.out.print(sb);
		
	}	
	
}