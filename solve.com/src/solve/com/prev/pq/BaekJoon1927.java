package solve.com.prev.pq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BaekJoon1927 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int x = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(n);

		for(int i = 0; i < n; i++) {
			x = Integer.parseInt(br.readLine());
			
			if(x == 0) {
				if(pq.size() == 0) {
					sb.append("0\n");
				} else {
					sb.append(pq.poll() + "\n");
				}
				continue;
			}
			
			pq.offer(x);
		}
		
		System.out.print(sb);
		
	}
	
}