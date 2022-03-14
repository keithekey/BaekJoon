package solve.com.prev.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BaekJoon10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		int rep = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < rep; i++) {
			String str = br.readLine();
			
			if(str.equals("pop_front")) {
				if(deque.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(deque.poll() + "\n");
				}
				continue;
			}
			
			if(str.equals("pop_back")) {
				if(deque.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(deque.pollLast() + "\n");
				}
				continue;
			}
			
			if(str.equals("size")) {
				sb.append(deque.size() + "\n");
				continue;
			}
			
			if(str.equals("empty")) {
				if(deque.isEmpty()) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
				continue;
			}
			
			if(str.equals("front")) {
				if(deque.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(deque.peek() + "\n");
				}
				continue;
			}
			
			if(str.equals("back")) {
				if(deque.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(deque.peekLast() + "\n");
				}
				continue;
			}
			
			StringTokenizer st = new StringTokenizer(str);
			String odr = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			
			if(odr.equals("push_front")) {
				deque.offerFirst(num);
			} else if(odr.equals("push_back")) {
				deque.offer(num);
			}
			
		}
		
		System.out.print(sb);
		
	}	
	
}