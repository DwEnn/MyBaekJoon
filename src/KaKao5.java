import java.util.ArrayList;

public class KaKao5 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
//      String str1 = "FRANCE", str2 = "french";
//      String str1 = "E=M*C^2", str2 = "e=m*c^2"; 
//      String str1 = "handshake", str2 = "shake hands";
      String str1 = "aa1+aa2", str2 = "AAAA12";
      	
      System.out.println(getJAKAD(str1, str2));
   }

   public static int getJAKAD(String str1, String str2) {
      
      ArrayList<String> arr1 = getArr(str1);
      ArrayList<String> arr2 = getArr(str2);
      
      
      System.out.println("arr1");
      System.out.println(arr1);
      System.out.println();
      System.out.println("arr2");
      System.out.println(arr2);
      System.out.println();
      
      ArrayList<String> union = getUnion(arr1, arr2);
      ArrayList<String> intersection = getIntersection(arr1, arr2);
      
      System.out.println("interscetion arr");
      System.out.println(intersection);
      System.out.println();
      
      System.out.println("union arr");
      System.out.println(union);
      System.out.println();
      
      System.out.println(intersection.size());
      System.out.println(union.size());
      
      if(union.size() == 0 && intersection.size() == 0)
    	  return 65536;
      
      
      float f = (float)(intersection.size()) / (float)(union.size());
      
      f *= 65536;
            
      return (int)f;
   }
   
   public static ArrayList<String> getIntersection(ArrayList<String> arr1, ArrayList<String> arr2) {
      ArrayList<String> list = new ArrayList<>();
      
      for(int i=0; i<arr1.size(); i++) {
         String str = arr1.get(i);   
         for(int j=0; j<arr2.size(); j++) {
//        	 System.out.println("i = " + i + "str = " + str + " arr2 : " + arr2.get(j));
            if(arr2.get(j).equalsIgnoreCase(str)) {
//            	System.out.println("added");
               list.add(str);
               arr2.remove(j);
               break;
            }
         }
      }
      return list;
   }
   
   public static ArrayList<String> getUnion(ArrayList<String> arr1, ArrayList<String> arr2) {
      ArrayList<String> list = new ArrayList<>();

      ArrayList<String> ar1 = new ArrayList<>();
      ar1.addAll(arr1);
      ArrayList<String> ar2 = new ArrayList<>();
      ar2.addAll(arr2);
      
      for(int i=0; i<ar1.size(); i++) {
    	  String str = ar1.get(i);
    	  for(int j=0; j<ar2.size(); j++) {
    		  System.out.println("i = " + i + "str = " + str + " arr2 : " + ar2.get(j));
    		  if(ar2.get(j).equalsIgnoreCase(str)) {
    			  System.out.println("added");
    			  list.add(str);
    			  ar2.remove(j);
    			  break;
    		  }
    	  }
      }
      
      return list;
   }
   
   public static ArrayList<String> getArr(String str) {
      ArrayList<String> list = new ArrayList<>();
      StringBuffer buffer = new StringBuffer();
      for(int i=0; i<str.length(); i++) {
         if(i == str.length()-1) {
            continue;
         } else {
            
            if(Character.isLetter(str.charAt(i)) && Character.isLetter(str.charAt(i+1))) {
               buffer.append(str.charAt(i)).append(str.charAt(i+1));
               list.add(buffer.toString());
               buffer = new StringBuffer();               
            } else {
               continue;
            }
         }
      }
      return list;
   }
}