import java.util.Scanner;

public class B1012 {

	static int T, M, N, K;
	static int[][] ad;
	static boolean[][] visit;
	
	static int count;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<T; i++) {
			count = 0;
			String in = sc.nextLine();
			String[] inp = in.split("\\s");
			M = Integer.parseInt(inp[0]);
			N = Integer.parseInt(inp[1]);
			K = Integer.parseInt(inp[2]);
			ad = new int[M+1][N+1];
			visit = new boolean[M+1][N+1];
			
			for(int j=0; j<K; j++) {
				String a = sc.nextLine();
				String[] a1 = a.split("\\s");
				int t1 = Integer.parseInt(a1[0]);
				int t2 = Integer.parseInt(a1[1]);
				
				ad[t1][t2] = 1;
			}
			
			dfsAll();
			System.out.println(count);
		}
		sc.close();
	}
	
	public static void dfs(int a, int b) {
		visit[a][b] = true;
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(ad[i][j] == 1 && visit[i][j] == false) {
					dfs(i,j);
//					count ++;
				}
			}
		}
	}

	public static void dfsAll() {
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(!visit[i][j] && ad[i][j] == 1) {
					dfs(i,j);
					count++;
				}
			}
		}
	}
}
