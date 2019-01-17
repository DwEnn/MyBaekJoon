package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11047 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split("\\s+");
		int N = Integer.parseInt(line[0]), K = Integer.parseInt(line[1]);
		
		int[] coin = new int[N];
		for (int i=0; i<N; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
		for (int i=N-1; i>=0; i--) {
			if (coin[i] > K) {
				continue;
			} else {
				count += K/coin[i];
				K %= coin[i];
			}
		}
		System.out.println(count);
	}

}
