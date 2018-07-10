import java.util.Scanner;

public class B2294 {
	
	static final int MAX_N = 101;
	static final int MAX_K = 10001;
	static final int IMPOSSIBLE = 1000001;
	
	static int N, K;
	static int[][] dp;
	static int[] cost;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] ip = input.split("\\s");
		
		N = Integer.parseInt(ip[0]);
		K = Integer.parseInt(ip[1]);
		
		dp = new int[N+1][K+1];
		for(int i=0; i<=N; i++)
			for(int j=0; j<=K; j++)
				dp[i][j] = -1;
		
		cost = new int[MAX_N];
		for(int i=0; i<N; i++)
			cost[i] = sc.nextInt();
		
		int result = coin(0, K);
		if(result == IMPOSSIBLE)
			System.out.println("-1");
		else
			System.out.println(result);
		
		sc.close();
	}
	
	public static int coin(int n, int k) {
		if(n == N) 
			return (k==0 ? 0 : IMPOSSIBLE); // base case
	    if(dp[n][k] != -1) 
	    	return dp[n][k]; // 이미 계산됨
	 
	    int result = coin(n+1, k);
	    if(k >= cost[n]) 
	    	result = Math.min(result, coin(n, k-cost[n]) + 1);
	    dp[n][k] = result; // dp 배열 값 갱신
	    return result;
	}
}
