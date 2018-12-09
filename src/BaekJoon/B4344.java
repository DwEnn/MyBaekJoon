package BaekJoon;
import java.util.Scanner;

public class B4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int[] score = null;
		double[] print = new double[c];
		
		for(int i=0; i<c; i++) {
			int n = sc.nextInt();
			score = new int[n];
			int sum = 0;
			double avg = 0;
			
			for(int j=0; j<n; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			
			avg = (double)(sum/n);
			int count = 0;
			
			for(int s : score) {
				if(s > avg)
					count ++;
			}
			
			double num = (double)count/n*100;

			print[i] = Math.round(num*1000d)/1000d;

		}
		
		for(double p : print)
			System.out.println(String.format("%.3f", p)+"%");
	}
}
