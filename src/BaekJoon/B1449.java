package BaekJoon;
import java.util.Arrays;
import java.util.Scanner;

public class B1449 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), L = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();
	
		Arrays.sort(arr);
		
		int line = 0;
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(line < arr[i]) {
				line = arr[i] + L - 1;
				System.out.println("i : " + i + " line : " + line);
				count ++;
			}
		}
	
		System.out.println(count);
			
		sc.close();
	}

}
