package etc;

/**
 * reference 생활코딩 ( https://opentutorials.org/course/1223/6237 )
 * @author DwEnn
 *
 */

public class GenericEx {

	public static void main(String[] args) {
		
		EmployeeInfo e1 = new EmployeeInfo(1);
		Integer i = new Integer(10);
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e1, i);
		p1.<EmployeeInfo>printInfo(e1);
//		p1.printInfo(e);
		
		EmployeeInfo e2 = new EmployeeInfo(2); 
		Person<EmployeeInfo, String> p2 = new Person<EmployeeInfo, String>(e2, "aa");
		p2.printInfo(e2);
				
	}
}

interface Info {
	public int getLevel();
}

class EmployeeInfo implements Info {
	public int rank;

	public EmployeeInfo(int rank) {
		this.rank = rank;
	}
	
	@Override
	public int getLevel() {
		return this.rank;
	}
}

class Person<T extends Info, S> {
	public T info;
	public S id;
	
	public Person(T info, S id) {
		this.info = info;
		this.id = id;
	}
	
	public <U> void printInfo(U info) {
		System.out.println(info);
	}
}
