import java.util.Scanner;

public class B8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<tc; i++) {
			String input = sc.nextLine();
			System.out.println(getScore(input));
		}
	}
	
	public static int getScore(String line) {
		int sum = 0, count = 0;
		for(int i=0; i<line.length(); i++) {
			if (line.charAt(i) == 'O') {
				count++;
				sum += count;
			} else
				count = 0;
		}
		return sum;
	}
}

