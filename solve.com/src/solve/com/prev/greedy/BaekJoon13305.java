package solve.com.prev.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon13305 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cities = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()); //도시간 거리
		StringTokenizer stk = new StringTokenizer(br.readLine()); //도시별 가격
		int d[] = new int[cities - 1];	//도시간 거리
		int p[] = new int[cities]; //도시별 가격

		for(int i = 0; i < cities; i++) {
			if(!st.hasMoreTokens()) {
				p[i] = Integer.parseInt(stk.nextToken());
				break;
			}
			d[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(stk.nextToken());
		}
		
		if(cities <= 2) {	//도시 수가 2개 이하일 경우 경우의 수는 1개
			System.out.print(d[0] * p[0]);
			return;
		}
		
		long curD = d[0]; //현재 거리
		long curP = p[0]; //현재 가격
		long res = 0; //결과값
		
		for(int j = 1; j < cities - 1; j++) { //마지막 도시의 가격의 경우 해당사항 없으므로 도시수 - 1 만큼 반복
			if(curP > p[j]) { //이번 도시의 가격이 지금까지 가장 저렴했던 도시의 가격보다 더 저렴한 경우
				res += curP * curD;	//지금까지 더했던 거리 * 지금까지 가장 저렴했던 도시의 가격을 결과값에 더해줌
				curD = d[j];		
				curP = p[j];		
				continue;
			}
			
			curD += d[j];
		}
		
		res += curP * curD;
		System.out.print(res);
		
	}
	
}