package BaekJoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B9498 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(br.readLine());
		
		if(score >= 90 & score <= 100)
			System.out.println("A");
		else if(score >= 80 & score < 90)
			System.out.println("B");
		else if(score >= 70 & score < 80)
			System.out.println("C");
		else if(score >= 60 & score < 70)
			System.out.println("D");
		else if(score <60)
			System.out.println("F");
	}

}
