package solve.com.prev.pq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class __BaekJoon1655 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int x = 0;
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i = 0; i < n; i++) {
			x = Integer.parseInt(br.readLine());
			
			if(minHeap.size() == maxHeap.size()) {
				maxHeap.offer(x);
			} else {
				minHeap.offer(x);
			}
			
			if(!minHeap.isEmpty() && !maxHeap.isEmpty()) {
				if(maxHeap.peek() > minHeap.peek()) {
					minHeap.offer(maxHeap.poll());
					maxHeap.offer(minHeap.poll());
				}
			}
			
			sb.append(maxHeap.peek() + "\n");
		}
		
		System.out.print(sb);
	}
	
}