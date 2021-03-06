package solve.com.prev.pq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BaekJoon1715 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Long> pq = new PriorityQueue<Long>(n);
		long res = 0;
		
		for(int i = 0; i < n; i++) {
			pq.offer(Long.parseLong(br.readLine()));
		}
		
		while(pq.size() > 1) {
			long card1 = pq.poll();
			long card2 = pq.poll();
			
			res += card1 + card2;
			pq.add(card1 + card2);
		}
		
		System.out.print(res);
		
	}
	
}