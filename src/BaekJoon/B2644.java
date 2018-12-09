package BaekJoon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2644 {

	static int V,E;
	static int ad[][];
	static boolean[] visit;
	static int[] chon = new int[101];
	
	static int a, b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		E = sc.nextInt();
		
		ad = new int[V+1][V+1];
		visit = new boolean[V+1];
		for(int i=0; i<E; i++) {
			int t1 = sc.nextInt();
			int t2 = sc.nextInt();
			
			ad[t1][t2] = ad[t2][t1] = 1;
		}
		
		System.out.println(bfs(a));
		
		sc.close();
	}
	
	public static int bfs(int i) {
		Queue<Integer> q = new LinkedList<>();
		HashMap<Integer, Boolean> hash = new HashMap<>();
		
		q.offer(i);
		

		while(!q.isEmpty()) {
			
			int temp = q.poll();
			visit[temp] = true;
				
			for(int k=1; k<=V; k++) {
				if(ad[temp][k] == 1 && !visit[k])
					if(!hash.containsKey(k)) {
						chon[k] = chon[temp] + 1;
						q.offer(k);
						hash.put(k, true);
					}
			}		
		}
		
		return (chon[b] == 0 ? -1 : chon[b]); 
	}
}

