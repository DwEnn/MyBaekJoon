import java.util.Scanner;

public class B2939 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		while(true) {
			if(N%5 == 0) {
				System.out.println(N/5 + count);
				break;
			} else if(N <= 0) {
				System.out.println("-1");
				break;
			}
			N -= 3;
			count ++;
		}
		
		sc.close();
	}

}

/*	5kg 을 최대한 많이 써야한다.
 *  설탕에서 3kg 씩 빼가며 5의 배수를 찾아가는 방법
 *  3kg 씩 빼다가 남은 양이 5의 배수라면 남은 설탕은 5kg에 담고
 *  0이라면 5kg 봉지를 쓸 수 없고,
 *  음수라면 설탕을 담을 방법이 없다는 것이다.
 */
