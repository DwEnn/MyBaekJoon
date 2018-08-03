import java.util.Scanner;

public class B10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int score[] = new int[5];
		for(int i=0; i<score.length; i++)
			score[i] = sc.nextInt();
		
		int sum = 0;
		for(int i=0; i<score.length; i++) {
			if(score[i] < 40)
				score[i] = 40;
			sum += score[i];
		}
		System.out.println(sum/5);
	}
}
