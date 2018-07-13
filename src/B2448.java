import java.util.Scanner;

public class B2448 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int line;
		int max;
		String[] tree = new String[n];
		
		line = 0;
		tree[0] = "  *  ";
		tree[1] = " * * ";
		tree[2] = "*****";
		
		max = (int)(Math.log(n/3)/Math.log(2));
		
		mkTree(max, tree);
		for(String s : tree)
			System.out.println(s);
		
	}
	
	public static void mkTree(int max, String[] tree) {
		int bottomNum, midNum;
		
		for(int i=1; i<=max; i++) {
			bottomNum = (int)(3*Math.pow(2, i));
			midNum = bottomNum/2;
			for(int k=midNum; k<bottomNum; k++) {
				tree[k] = tree[k-midNum] + " " + tree[k-midNum];
			}
			String space = " ";
			while(space.length() < midNum)
				space += " ";
			
			for(int j=0; j<midNum; j++)
				tree[j] = space + tree[j] + space;
		}
	}

}
