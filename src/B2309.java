import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class B2309 {

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int height[] = new int[9];
		int sum=0;
		
		for(int i=0; i<height.length; i++)
			height[i] = sc.nextInt();
		
		for(int i=0; i<height.length-1; i ++) {
			for(int j=i+1; j<height.length; j++) {
				sum = getSum(height, i, j);
				if(sum == 100) {
					height[i] = 0;
					height[j] = 0;
					break;
				}
			}
		}
		
		Arrays.sort(height);
		for(int i=2; i<height.length; i++) {
			System.out.println(height[i]);
		}
		sc.close();
	}
	
	public static int getSum(int[] height, int a, int b) {
		int sum=0;
		for(int i=0; i<height.length; i++) {
			if(i==a || i==b)	
				continue;
			sum += height[i];
		}
		return sum;
	}
}
