package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1912 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0, max = 0;
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			sum = Math.max(sum+num, num);
			max = Math.max(sum, max);
		}
		System.out.println(max);
		br.close();
	}

}
