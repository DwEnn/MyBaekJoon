package BaekJoon;
import java.util.Scanner;

public class B1629 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] data = input.split("\\s");
		long A = Integer.parseInt(data[0]), B = Integer.parseInt(data[1]), C = Integer.parseInt(data[2]);
		
		long AB = 1;
		for(int i=0; i<B; i++)
			AB *= A;
		long result = AB%C;
		
		System.out.println(result);
	}
}
