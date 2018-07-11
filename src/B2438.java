import java.util.Scanner;

public class B2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String input = "";
		
		for(int i=0; i<n; i++) {
			input += "*";
			System.out.println(input);
		}
		
		sc.close();
	}

}
