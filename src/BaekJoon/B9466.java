package BaekJoon;
import java.util.Scanner;
import java.util.Vector;

public class B9466 {
	
	static Vector<Vector<Integer>> students;
	static Vector<Boolean> visited;
	static Vector<Boolean> finished;
	
	static int cnt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int count = 0;
		int[] input;
		while (T > count) {
			int n = sc.nextInt();
			sc.nextLine();
			input = new int[n];

			for (int i = 0; i < n; i++)
				input[i] = sc.nextInt();
			
			cnt = 0;
			visited = new Vector<>();
			finished = new Vector<>();
			students = new Vector<>();
			for(int i=0; i<n; i++) {
				visited.add(false);
				finished.add(false);
				students.add(new Vector<>());
			}
			
			for(int i=0; i<input.length; i++)
				addVote(i, input[i]-1);
			
			
			dfsAll();
			System.out.println(cnt);
			
			count++;
		}
		sc.close();
	}
	
	public static void addVote(int a, int b) {
		students.get(a).add(b);
	}
	
	public static void dfsAll() {
		for(int i=0; i<students.size(); i++) {
			if(!visited.get(i)) {
				dfs(i);
			}
		}
	}
	
	public static void dfs(int index) {
		visited.set(index, true);
		for(int i : students.get(index)) {
			if(visited.get(i)) {
				if(!finished.get(i)) {
					cnt ++;
				}
			} else {
				dfs(i);
			}	
		}
		finished.add(index, true);
	}
	

}
