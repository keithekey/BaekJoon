package solve.com.prev.pq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BaekJoon11286 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int x = 0;
		PriorityQueue<Integer> pqPositive = new PriorityQueue<Integer>();
		PriorityQueue<Integer> pqNegative = new PriorityQueue<Integer>(Collections.reverseOrder());

		for(int i = 0; i < n; i++) {
			x = Integer.parseInt(br.readLine());
			
			if(x == 0) {
				if(pqPositive.size() == 0 && pqNegative.size() == 0) {
					sb.append("0\n");
					continue;
				} else {
					if(pqPositive.size() == 0) {
						sb.append(pqNegative.poll() + "\n");
						continue;
					}
					if(pqNegative.size() == 0) {
						sb.append(pqPositive.poll() + "\n");
						continue;
					}
					sb.append(pqPositive.peek() < (pqNegative.peek() * -1) ? pqPositive.poll() : pqNegative.poll());
					sb.append("\n");
				}
			}
			
			if(x > 0) {
				pqPositive.offer(x);
			} 
			
			if(x < 0 ){
				pqNegative.offer(x);
			}
		}
		
		System.out.print(sb);
	}
	
}