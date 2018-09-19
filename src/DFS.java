import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class DFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 무방향 연결 그래프
		// Graph G = new Graph(9);
		// G.addEdge(0, 1);
		// G.addEdge(0, 2);
		// G.addEdge(1, 3);
		// G.addEdge(1, 5);
		// G.addEdge(3, 4);
		// G.addEdge(4, 5);
		// G.addEdge(2, 6);
		// G.addEdge(2, 8);
		// G.addEdge(6, 7);
		// G.addEdge(6, 8);
		// G.sortList();
		// G.dfs();

		// 무방향 다수의 컴포넌트
		// Graph G = new Graph(10);
		// G.addEdge(0, 1);
		// G.addEdge(1, 3);
		// G.addEdge(2, 3);
		// G.addEdge(4, 6);
		// G.addEdge(5, 7);
		// G.addEdge(5, 8);
		// G.addEdge(7, 8);
		// G.sortList();
		// int components = G.dfsAll();
		// System.out.println("The number of component is : " + components);

		// 정점 수 구하기
		Graph G = new Graph(10);
		G.addEdge(0, 1);
		G.addEdge(1, 3);
		G.addEdge(2, 3);
		G.addEdge(4, 6);
		G.addEdge(5, 7);
		G.addEdge(5, 8);
		G.addEdge(7, 8);
		G.sortList();
		int components = G.dfsAllCnt();
		System.out.println("The number of component is : " + components);

	}

}

class Graph {
	private int N;
	private Vector<Vector<Integer>> adj;
	private Vector<Boolean> visited;

	Graph(int n) {
		N = n;

		adj = new Vector<>();
		visited = new Vector<>();
		for (int i = 0; i < N; i++)
			adj.add(new Vector<>());

		visited.setSize(N);
	}

	void addEdge(int u, int v) {
		adj.get(u).addElement(v);
		adj.get(v).addElement(u);
	}

	void sortList() {
		for (int i = 0; i < N; i++)
			Collections.sort(adj.get(i), new GraphCompare());
	}

	void dfs() {
		for (int i = 0; i < N; i++)
			visited.set(i, false);

		for (int i = 0; i < N; i++) {
			System.out.print("i : " + i + " adj[i] : ");
			for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.print(adj.get(i).get(j) + " ");
			}
			System.out.println();
		}

		dfs(0);
	}

	int dfsAll() {
		int components = 0;
		for (int i = 0; i < N; i++)
			visited.set(i, false);

		for (int i = 0; i < N; i++) {
			if (!visited.get(i)) {
				System.out.println("-- new DFS begins --");
				dfs(i);
				components++;
			}
		}

		return components;
	}

	private void dfs(int curr) {
		visited.set(curr, true);
		System.out.println("node : " + curr + " visited");
		for (int next : adj.get(curr)) {
			if (!visited.get(next))
				dfs(next);
		}
	}

	// 모든 정점을 DFS 하고 컴포넌트 개수 반환
	int dfsAllCnt() {
		int components = 0;
		for (int i = 0; i < N; i++)
			visited.set(i, false);

		for (int i = 0; i < N; i++) {
			if (!visited.get(i)) {
				System.out.println("-- new DFS begins --");
				int nodes = dfsCnt(i);
				components++;
				System.out.println("size : " + nodes);
			}
		}
		return components;
	}

	// curr 부터 방문한 정점 개수 반환
	private int dfsCnt(int curr) {
		int nodes = 1;
		visited.set(curr, true);
		System.out.println("node : " + curr + " visited");
		for (int next : adj.get(curr)) {
			if (!visited.get(next))
				nodes += dfsCnt(next);
		}
		return nodes;
	}

}

class GraphCompare implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}