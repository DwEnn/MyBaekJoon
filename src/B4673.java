
public class B4673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] sN = new boolean[10001];
		
		for(int i=1; i<=10000; i++) {
			int num = selfNum(i);
			if(num <= 10000)
				sN[num] = true;
		}
		
		for(int i=1; i<=10000; i++) {
			if(!sN[i])
				System.out.println(i);
		}
	}
	
	public static int selfNum(int num) {
		int dn = num;
		while(num > 0) {
			dn += num%10;
			num /= 10;
		}
		return dn;
	}
}
