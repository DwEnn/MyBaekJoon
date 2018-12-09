package BaekJoon;
import java.util.Scanner;

public class B2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		String result = String.valueOf(A*B*C);
		
		for(int j=0; j<10; j++) {
			int count = 0;
			for(int i=0; i<result.length(); i++) {
//				System.out.println(Character.getNumericValue(Integer.valueOf(result.charAt(i))));
//				System.out.println(j);
				if (Character.getNumericValue(Integer.valueOf(result.charAt(i))) == j)
					count++;
			}
			System.out.println(count);
		}
		
	}

}
