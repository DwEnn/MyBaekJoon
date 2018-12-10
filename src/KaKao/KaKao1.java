package KaKao;

public class KaKao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {
	      String[] answer = new String[n];
	     
	      for(int i=0; i<n; i++) {
	          int num = arr1[i]|arr2[i];
	          String str = Integer.toBinaryString(num);
	          if(str.length() < n) {
					int a = n - str.length();
					for(int j=0; j<a; j++) {
						str = "0" + str;
					}
				}
	          answer[i] = str.replace('1', '#').replace('0', ' ');
	      }
	      return answer;
	  }
}
