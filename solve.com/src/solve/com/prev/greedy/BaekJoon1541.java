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
		StringTokenizer st = new StringTokenizer(str, "+-"); //+와 -를 기준으로 입력받은 문자열의 숫자들만 골라냄
		Queue<Character> queue = new LinkedList<>();
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) { //문자열의 길이만큼 반복하며 Queue에 연산부호를 넣어줌
			if(str.charAt(i) == '+' || str.charAt(i) == '-') {
				queue.offer(str.charAt(i));
			}
		}
		
		sum += Integer.parseInt(st.nextToken());
		
		//이중 괄호 가능?
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