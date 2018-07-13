import java.util.Scanner;

public class B2441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuffer buffer = new StringBuffer();
		
		for(int i=0; i<n; i++)
			buffer.append("*");
		
		for(int i=0; i<n; i++) {
			System.out.println(buffer.toString());
			buffer.replace(i, i+1, " ");
		}
		sc.close();
	}

}
