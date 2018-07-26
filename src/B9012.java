import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B9012 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		for(int i=0; i<tc; i++) {
			String line = br.readLine();
			cal(line);
		}
	}
	
	public static void cal(String line) {
		int count = 0;
		for(int i=0; i<line.length(); i++) {
			if (line.charAt(i) == '(') {
				count ++;
			} else if (line.charAt(i) == ')') {
				count --;
			}
			// 검사중 ')'가 '('보다 많은 경우 "NO" 출력
			if(count<0) {
				System.out.println("NO");
				return;
			}
		}
		
		if(count == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
