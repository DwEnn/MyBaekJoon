import java.util.ArrayList;

public class KaKao3 {

	final static int cacheHit = 1;
	final static int cacheMiss = 5;
	static int cacheCnt = 0;
	
	static ArrayList<String> cache;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cacheSize = 30;
		String cities[] = new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome",
				"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome",
				"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		cache = new ArrayList<>();
		
		int processTime = 0;
		for(int i=0; i<cities.length; i++) {
			processTime += put(cities[i], cacheSize);
		}
		System.out.println(processTime);
	}

	public static int put(String city, int cacheSize) {
		for(int i=0; i<cache.size(); i++) {
			if(cache.get(i).equalsIgnoreCase(city))
				return cacheHit;
		}
		
		if(cache.size() < cacheSize)
			cache.add(city);
		else if(cacheSize == 0)
			return cacheMiss;
		else {
			cache.remove(0);
			cache.add(city);
		}
		
		return cacheMiss;
	}
}
