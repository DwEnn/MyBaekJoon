import java.util.Arrays;
import java.util.Scanner;

public class B1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] score = new int[n];
		
		for(int i=0; i<n; i++) {
			score[i] = sc.nextInt();
		}
		
		int max = 0;
		for(int i=0; i<n; i++) {
			if(score[i] > max)
				max = score[i]; 
		}
		double sum = 0;
		for(int i : score)
			sum += (double)i/max*100;
		
		System.out.println((double)sum/n);
		
	}

}
