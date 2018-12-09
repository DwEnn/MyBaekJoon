package BaekJoon;
import java.util.Scanner;

public class B4796 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] input = new String[3];
		int count = 1;
		while(true) {
			input = sc.nextLine().split("\\s");
			int L = Integer.parseInt(input[0]), P = Integer.parseInt(input[1]), V = Integer.parseInt(input[2]);
			if(L == 0 && P == 0 && V == 0)
				break;
			
			System.out.println("Case " + count + ": " + (V/P*L + Math.min(L, V%P)));	
			count ++;
		}
		sc.close();
	}
}
