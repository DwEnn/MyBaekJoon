package BaekJoon;
import java.util.Scanner;

public class B9465 {

	static int N, T;
	static int[][] value;
	static int[][] dp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		System.out.println(T);
		sc.nextLine();
		for(int i=0; i<T; i++) {
			System.out.println("aa");
			N = sc.nextInt();
			System.out.println(N);
			for(int j=0; j<2; j++) {
				value = new int[2][N];
				for(int k=0; k<N; k++) {
					String input = sc.nextLine();
					String ip[] = input.split("\\s");
					value[j][k] = Integer.parseInt(ip[k]);
				} 
			}
			
			dp = new int[N+1][3];
			for(int a=0; a<N+1; a++)
				for(int b=0; b<3; b++)
					dp[a][b] = -1;
			
			System.out.println(sticker(0,0));
		}
		sc.close();
	}
	
	public static int sticker(int c, int status) {
		if(c==N)
			return 0;
		if(dp[c][status] != -1)
			return dp[c][status];
		
		int result = sticker(c+1, 0);
		if(status != 1)
			result = Math.max(result, sticker(c+1, 1)+value[0][c]);
		if(status != 2)
			result = Math.max(result, sticker(c+1, 2) + value[0][c]);
		dp[c][status] = result;
		return result;
	}
}
