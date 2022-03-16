package solve.com.prev.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon1541 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, "+-"); //+�� -�� �������� �Է¹��� ���ڿ��� ���ڵ鸸 ���
		Queue<Character> queue = new LinkedList<>();
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) { //���ڿ��� ���̸�ŭ �ݺ��ϸ� Queue�� �����ȣ�� �־���
			if(str.charAt(i) == '+' || str.charAt(i) == '-') {
				queue.offer(str.charAt(i));
			}
		}
		
		sum += Integer.parseInt(st.nextToken());
		
		//���� ��ȣ ����?
		int rep = queue.size();
		for(int j = 0; j < rep; j++) {
			if(queue.peek() == '+') {
				sum += Integer.parseInt(st.nextToken());
				queue.poll();
			} else if(queue.peek() == '-') {
				while(st.hasMoreTokens()) {
					sum -= Integer.parseInt(st.nextToken());
				}
				break;
			}
		}
		
		System.out.print(sum);
	}
	
}