import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _BaekJoon10872 {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(makeFac(Integer.parseInt(br.readLine())));
		
	}
	
	public static int makeFac(int a) {
		
		if(a <= 1) {
			return 1;
		} else {
			return makeFac(a - 1) * a;
		}
		
	}

}
