package BaekJoon;

import java.util.HashMap;
import java.util.Scanner;

public class B1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		mine(input);
		answer(input);
		
		sc.close();
	}
	
	public static void answer(String input) {
		// reference ( http://andamiro25.tistory.com/70 )
		input = input.toUpperCase();
		int cnt[] = new int[26];
		int max = 0;
		char answer = '?';
		
		for(int i=0; i<input.length(); i++) {
			cnt[input.charAt(i)-65]++;
			if(max < cnt[input.charAt(i)-65]) {
				answer = input.charAt(i);
				max = cnt[input.charAt(i)-65];
			} else if (max == cnt[input.charAt(i)-65])
				answer = '?';
		}
		System.out.println(answer);
	}
	
	public static void mine(String input) {	
		HashMap<Character, Integer> map = new HashMap<>();
		int max=0;
		char maxKey = '?';
		
		for(int i=0; i<input.length(); i++) {
			int count = 0;
			char c = Character.toUpperCase(input.charAt(i));
			if (!map.containsKey(c)) {
				for(int j=i; j<input.length(); j++) {
					if(c == Character.toUpperCase(input.charAt(j)))
						count++;
				}
				if(count > max) {
					max = count;
					maxKey = c;
				} else if(count == max) {
					maxKey='?';
					break;
				}
				map.put(c, count);
			}
		}
		System.out.println(maxKey);
	}

}
