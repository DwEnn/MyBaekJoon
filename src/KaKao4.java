import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;



public class KaKao4 {
	
	final static String[] T1 = {"08:00", "08:01", "08:02", "08:03"};
	final static String[] T2 = {"09:10", "09:09", "08:00"};
//	final static String[] T3 = {"09:00", "09:00", "09:00", "09:00"};
//	final static String[] T3 = {"23:59"};
	final static String[] T3 = {"23:59","23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59",
			"23:59", "23:59", "23:59", "23:59", "23:59"};
	final static String startTime = "09:00";

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		int n=10, t=60, m=45;
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");

		long[] busTable = new long[n];
		busTable[0] = format.parse(startTime).getTime();
		for(int i=1; i<n; i++)
			busTable[i] = busTable[i-1] + 60000*t;

		ArrayList<Long> crew = new ArrayList<Long>();
//		long[] crew = new long[T2.length];
		for(int i=0; i<T3.length; i++)	
			crew.add(format.parse(T3[i]).getTime());

		Collections.sort(crew);

//		for(long ti : crew) {
//			System.out.print(ti + "\t");
//			Date d = new Date();
//			d.setTime(ti);
//			System.out.println(format.format(d));
//		}

		int lastBus = n-1;
		String conn = "ÄÜ µµÂø½Ã°£ : ";
		for(int i=0; i<n; i++) {
			ArrayList<String> boarding = new ArrayList<>();
			int people = crew.size();
			for(int j=0; j<m; j++) {
				if(lastBus == i) {
					if(people < m) {
						Date d = new Date();
						d.setTime(busTable[i]);
						System.out.println(conn + format.format(d));
						break;
					} else {
						if(crew.get(m-1) <= busTable[i]) {
							Date d = new Date();
							d.setTime(crew.get(m-1) - 60000);
							System.out.println(conn + format.format(d));
							break;
						} else {
							Date d = new Date();
							d.setTime(busTable[i]);
							System.out.println(conn + format.format(d));
							break;							
						}
					}
				} else {
					if(crew.size() <= j) {
						continue;
					} else {
						if(crew.get(j) <= busTable[i]) {
							Date d = new Date();
							d.setTime(crew.get(0));
							crew.remove(0);
							boarding.add(format.format(d));
						}						
					}
				}
			}
		}
	}
}
