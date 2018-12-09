package BaekJoon;
import java.util.Scanner;

public class B2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int input[] = new int[8];
		
		for(int i=0; i<input.length; i++)
			input[i] = sc.nextInt();
		
		String result = "";
		if(input[0] == 1) {
			for(int i=1; i<=input.length; i++) {
				if(i != input[i-1]) {
					result = "mixed";
					break;
				}
				result = "ascending";
			}
		} else if(input[0] == 8) {
			int compare = 1;
			for(int i=input.length; i>0; i--) {		
				if(compare != input[i-1]) {
					result = "mixed";
					break;
				}
				result = "descending";
				compare ++;
			}
		} else 
			result = "mixed";
		
		System.out.println(result);
	}
}
