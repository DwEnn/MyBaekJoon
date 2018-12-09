package Algorithm;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Vector;

public class BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BFSGraph G = new BFSGraph(9);
		G.addEdge(0, 1);
		G.addEdge(0, 2);
		G.addEdge(1, 3);
		G.addEdge(1, 5);
		G.addEdge(3, 4);
		G.addEdge(4, 5);
		G.addEdge(2, 6);
		G.addEdge(2, 8);
		G.addEdge(6, 7);
		G.addEdge(6, 8);
		G.sortList();
//		G.bfs();
		G.bfsCntLevel();
		
	}

}

class BFSGraph {
	int N;
	Vector<Vector<Integer>> adj;

	BFSGraph(int N) {
		this.N = N;
		adj = new Vector<>();
		for (int i = 0; i < N; i++)
			adj.add(new Vector<>());
	}

	// 모든 리스트의 인접한 정점 번호 정렬
	void sortList() {
		for (int i = 0; i < N; i++) {
//			Collections.sort(adj.get(i), new BFSCompare());
			Collections.sort(adj.get(i));
		}
	}

	// 간선 추가 함수
	void addEdge(int u, int v) {
		adj.get(u).addElement(v);
		adj.get(v).addElement(u);
	}

	// 너비 우선 탐색
	void bfs() {
		boolean visited[] = new boolean[N];

		LinkedList<Integer> queue = new LinkedList<>();
		queue.push(0);
		visited[0] = true;

		// 탐색시작
		while (!queue.isEmpty()) {
			int curr = queue.getFirst();
			queue.pop();
			System.out.println("node : " + curr + " visited");
			for (int next : adj.get(curr)) {
				if (!visited[next]) {
					visited[next] = true;
					queue.add(next);
				}
			}
		}
	}

	// 너비 우선 탐색
	void bfsCntLevel() {
		boolean visited[] = new boolean[N];

		LinkedList<Integer> queue = new LinkedList<>();
		queue.push(0);
		visited[0] = true;
		
		// 탐색시작
		int level = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			System.out.println("---- level : " + level + " ----");
			for (int i = 0; i < size; i++) {
				int curr = queue.getFirst();
				queue.pop();
				System.out.println("node : " + curr + " visited");
				for (int next : adj.get(curr)) {
					if (!visited[next]) {
						visited[next] = true;
						queue.add(next);
					}
				}
			}
			level++;
		}
	}
}

class BFSCompare implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}

}
