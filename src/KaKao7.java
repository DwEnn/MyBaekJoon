import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class KaKao7 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String[] lines = {"2016-09-15 20:59:57.421 0.351s"};
		String str = "2016-09-15 20:59:57.421";
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date d = format.parse(str);
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		System.out.println(format.format(d.getTime()));
		System.out.println(c.get(Calendar.SECOND));
		
	}
}

class Solution2 {
	  public int solution(String[] lines) {
		  int answer = 0;
		  
		  
		  
		  return answer;
      }
	  
	  public boolean[] getTimeTable() {
		  boolean[] timeTable = new boolean[3];
		  
		  
		  
		  return timeTable;
	  }
}