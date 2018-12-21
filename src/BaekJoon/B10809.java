package BaekJoon;

import java.util.Scanner;

public class B10809 {

	public static void main(String[] args) {
		// a-z : 97-122 = 25 ¹ø
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int str[] = new int[input.length()];
		for(int i=0; i<str.length; i++) {
			str[i] = (int) input.charAt(i);
		}
		for(int i=97; i<123; i++) {
			boolean found = false;
			for(int j=0; j<str.length; j++) {
				if(str[j] == i) {
					System.out.print(j + " ");
					found = true;
					break;
				}
			}
			if(!found)
				System.out.print(-1 + " ");
		}
		sc.close();
	}

}
