import java.util.Scanner;

public class B2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		StringBuffer buffer = new StringBuffer();
		
		for(int i=0; i<n; i++)
			buffer.append(" ");
		
		for(int i=0; i<n; i++) {
			buffer.delete(0, 1);
			buffer.append("*");
			System.out.println(buffer.toString());
		}

		sc.close();
	}

}
