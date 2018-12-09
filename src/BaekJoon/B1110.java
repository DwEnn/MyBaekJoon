package BaekJoon;
import java.util.Scanner;

public class B1110 {
	
	private static int count = 0;
	private static int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		int a = num/10;
		int b = num%10;
		cal(a,b);
	}
	
	public static void cal(int a, int b) {
		int sum = a + b;
		count ++;
		int B = sum%10;
		int ans = b*10 + B;
		if(ans == num)
			System.out.println(count);
		else
			cal(b, B);
		
	}

}
