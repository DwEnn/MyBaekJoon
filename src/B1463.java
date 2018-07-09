import java.util.Scanner;

public class B1463 {

	static int[] dp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		dp = new int[input+1];
		
		for(int i=0; i<dp.length; i++)
			dp[i] = -1;
		
		System.out.println(f(input));
		
	}
	
	public static int f(int n) {
		if(n==1)
			return 0;
		if(dp[n] != -1)
			return dp[n];
		
		int result = f(n-1) + 1;
		
		if(n%3 == 0)
			result =  Math.min(result, f(n/3)+1);
		if(n%2 == 0)
			result =  Math.min(result, f(n/2)+1);
		
		dp[n] = result;
		return result;
	}
}
