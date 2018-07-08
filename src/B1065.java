import java.util.ArrayList;
import java.util.Scanner;

public class B1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(hanSue(i))
				count ++;
		}
		System.out.println(count);
	}

	public static boolean hanSue(int num) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		while (num > 0) {
			arr.add(num%10);
			num /= 10;
		}
		
		if (arr.size() < 3)
			return true;
		
		int dis = arr.get(1) - arr.get(0);
		
		for(int i=1; i<arr.size()-1; i++ ) {
			 int ds = arr.get(i+1) - arr.get(i);
			 if(dis != ds)
				 return false;
		}
		return true;
	}
}
