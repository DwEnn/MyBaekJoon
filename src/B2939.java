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

/*	5kg �� �ִ��� ���� ����Ѵ�.
 *  �������� 3kg �� ������ 5�� ����� ã�ư��� ���
 *  3kg �� ���ٰ� ���� ���� 5�� ������ ���� ������ 5kg�� ���
 *  0�̶�� 5kg ������ �� �� ����,
 *  ������� ������ ���� ����� ���ٴ� ���̴�.
 */
