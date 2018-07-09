import java.util.Scanner;

public class B1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		int count = 0;
		String word = "";
		for(int i=0; i<line.length(); i++) {
			String c = String.valueOf(line.charAt(i));
			if(!c.equals(" ")) {
				if(word.length() == 0) {
					count ++;
				}
				word = c;
			} else
				word = "";
			
		}
		System.out.println(count);
	}

}
