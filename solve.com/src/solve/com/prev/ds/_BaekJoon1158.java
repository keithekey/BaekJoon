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
		int a = Integer.parseInt(stk.nextToken()); //�ݺ��� Ƚ��
		int b = Integer.parseInt(stk.nextToken()); //b��° ��� ����
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 1; i <= a; i++) {//Queue�� a������ ��� ���� �ֱ�
			queue.offer(i);
		}
		
		sb.append("<");
		
		while(queue.size() > 1) { //���ڰ� 1�� ���� ������ �ݺ�
			
			for(int j = 1; j <= b; j++) { //b��° ��� ����
				if(j == b) {
					sb.append(queue.poll() + ", ");
				} else {
					queue.offer(queue.poll());
				}
			}
		}
		
		sb.append(queue.poll() + ">"); //���ڰ� �Ѱ� ������ �� �޸� ���� ������
		
		System.out.print(sb);
		
	}	
	
}