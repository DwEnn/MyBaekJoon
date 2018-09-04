
public class KaKao2 {

	public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      String dartResult = "1S2D*3T";
//	      String dartResult = "1S2D";
	      
	      String[] T = new String[3];
	      
	      int[] score = new int[3];	     
	      int count = 0, num = 0;
	      
	      
	      boolean isAppended = false;
	      boolean is = true;
	  
	      for(int i=0; i<dartResult.length(); i++) {
	         char c = dartResult.charAt(i);
	         
	         if(Character.isDigit(c)) {
	        	 if (!isAppended) {
		        	 isAppended = true;
//		        	 isFirstNum = false;
		        	 num = Character.getNumericValue(c);
				} else {
					num = 10;
					isAppended = false;
				}
	         } else if(c == '#'){
	        	 score[count-1] = score[count-1]*-1;
	         } else if(c == '*'){
	        	 if(count == 1) {
	        		 score[count-1] = score[count-1]*2;
	        	 } else {
	        		 score[count-2] = score[count-2]*2;
	        		 score[count-1] = score[count-1]*2; 
	        	 }
	         }else {
	        	 isAppended = false;
	        	 switch(c) {
	        	 case 'S' :
	        		 score[count++] = num;
	        		 break;
	        	 case 'D' :
	        		 score[count++] = num*num;
	        		 break;
	        	 case 'T' :
	        		 score[count++] = num*num*num;
	        		 break;
	        	 }
	         }
	      }
	      
	      int sum = score[0] + score[1] + score[2];
	      System.out.println(sum);
	      
//	      for(int s : score) {
//	    	  System.out.println(s);
//	      }
	   }
}
