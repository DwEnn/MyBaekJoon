package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), X = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num < X)
				sb.append(num + " ");
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		
		br.close();
		bw.flush();
		bw.close();
	}

}
