package BaekJoon;

import java.util.Scanner;

public class B2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		String lines[] = new String[T];
		for(int i=0; i<T; i++) {
			lines[i] = sc.nextLine();
		}
		
		for(int i=0; i<T; i++) {
			String lin[] = lines[i].split("\\s+");
			for(int j=0; j<lin[1].length(); j++) {
				for(int t=0; t<Integer.valueOf(lin[0]); t++) {
					System.out.print(lin[1].charAt(j));
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
