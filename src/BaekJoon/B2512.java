package BaekJoon;
import java.util.Scanner;

public class B2512 {

	static int N, M, MAX;
	static int[] cost;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cost = new int[1000000];
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.nextLine();
		String in = sc.nextLine();
		String[] inp = in.split("\\s");
		for(int i=0; i<N; i++) {
			cost[i] = Integer.parseInt(inp[i]);
			if(cost[i] >= MAX) MAX = cost[i];
		}
		M = sc.nextInt();
		
		int lo = 0, hi = MAX;
		
		while(lo+1 < hi) {
			int mid = (lo+hi)/2;
			
			long sum = 0;
			for(int i=0; i<N; i++) {
				if(cost[i] > mid)
					sum += mid;
				else
					sum += cost[i];
			}
			
			if(sum >= M)
				hi = mid;
			else
				lo = mid;
		}
			
		System.out.println(lo);
		sc.close();
	}
}
