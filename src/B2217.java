import java.util.Arrays;
import java.util.Scanner;

public class B2217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int[] arr = new int[N];
//		for(int i=0; i<arr.length; i++)
//			arr[i] = sc.nextInt();
		
		int[] arr = {5, 10, 25, 25, 100, 50};
		
		Arrays.sort(arr);

		for(int i=arr.length-1; i>0; i--) {
			if(arr[i] * (arr.length - i) > arr[i-1] * (arr.length - (i-1))) {
				System.out.println(arr[i] * (arr.length - i));
				break;
			} else {
				if(i == 1)
					System.out.println(arr[0] * arr.length);
			}
		}
		
		sc.close();
	}

	// solution
	public static void solution() {
		Scanner sc = new Scanner(System.in);
		int i, n = sc.nextInt(), k=0;
		int d[] = new int[n];
		for(i=0; i<n; i++)
			d[i] = sc.nextInt();
		
		Arrays.sort(d);
		
		for(i=n-1; i>-1; i--) {
			if(k<d[i]*(n-i))
				k = d[i]*(n-1);
		}
		
		System.out.println(k);
		
		sc.close();
		
	}
	
}



