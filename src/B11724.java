import java.util.Scanner;
import java.util.Vector;

public class B11724 {
	
	static Vector<Vector<Integer>> adj;
	static Vector<Boolean> visited;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		sc.nextLine();
		
		adj = new Vector<>();
		visited = new Vector<>();
		for(int i=0; i<N; i++) {
			adj.add(new Vector<>());
			visited.add(false);
		}
		
		for(int i=0; i<M; i++) {
			int u = sc.nextInt() -1, v = sc.nextInt() -1;
			
			adj.get(u).addElement(v);
			adj.get(v).addElement(u);
		}
		
		System.out.println(dfsAll());
		
		sc.close();
	}
	
	public static void dfs(int index) {
		visited.set(index, true);
		for(int i: adj.get(index)) {
			if(!visited.get(i))
				dfs(i);
		}
	}
	
	public static int dfsAll() {
		int components = 0;
		for(int i=0; i<adj.size(); i++) {
			if(!visited.get(i)) {
				dfs(i);
				components ++;
			}
		}
		return components;
	}

}
