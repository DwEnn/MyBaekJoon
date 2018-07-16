import java.util.Scanner;

public class B2805 {

	static int N, M;
	static int[] height;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		height = new int[10000000];
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String[] inp = in.split("\\s");
		N = Integer.parseInt(inp[0]);
		M = Integer.parseInt(inp[1]);
		
		String n = sc.nextLine();
		String[] na = n.split("\\s");
		for(int i=0; i<N; i++)
			height[i] = Integer.parseInt(na[i]);
		
		int lo =0, hi = 100000000;
		
		while(lo+1 < hi) {
			int mid = (lo+hi)/2;
			
			long sum = 0;
			for(int i=0; i<N; i++)
				if(height[i] > mid) sum += height[i] - mid;
			
			if(sum >= M) lo = mid;
			else hi = mid;
		}
		
		System.out.println(lo);
		sc.close();
	}

}
