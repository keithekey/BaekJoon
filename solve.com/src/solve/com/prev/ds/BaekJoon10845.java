package solve.com.prev.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon10845 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int last = 0; //������ ��
		int n = Integer.parseInt(br.readLine()); //�ݺ��� Ƚ��
		
		for(int i = 0; i < n; i++) { //�Է¹��� Ƚ����ŭ �ݺ�
			String str = br.readLine(); //��ɾ� �Է¹���
			
			if(str.equals("pop")) {
				if(!queue.isEmpty()) {
					sb.append(queue.poll() + "\n");
				} else {
					sb.append("-1\n");
				}
				continue;
			}
			
			if(str.equals("size")) {
				sb.append(queue.size() + "\n");
				continue;
			}
			
			if(str.equals("empty")) {
				if(queue.isEmpty()) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
				continue;
			}
			
			if(str.equals("front")) {
				if(queue.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(queue.peek() + "\n");
				}
				continue;
			}
			
			if(str.equals("back")) {
				if(queue.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(last + "\n");
				}
				continue;
			}
			
			StringTokenizer st = new StringTokenizer(str);
			if(st.nextToken().equals("push")) {
				int a = Integer.parseInt(st.nextToken());
				queue.offer(a);
				last = a;
			}
			
		}
		
		System.out.print(sb);
		
	}	
	
}