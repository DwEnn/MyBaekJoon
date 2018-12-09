package BaekJoon;
import java.util.Scanner;

public class B2440 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuffer buffer = new StringBuffer();
		
		for(int i=0; i<n; i++)
			buffer.append("*");
		
		for(int i=n; i>0; i--) {
			System.out.println(buffer.toString());
			buffer.delete(i-1, i);
		}
		
		sc.close();
	}

}
