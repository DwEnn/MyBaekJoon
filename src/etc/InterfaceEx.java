package etc;

/**
 * references 생활코딩 ( https://opentutorials.org/course/1223/6063 ) 
 * @author DwEnn
 *
 */

public class InterfaceEx {

	public static void main(String[] args) {

		CalculatorA c = new CalculatorA();
		c.setOprands(10, 20, 30);
		System.out.println(c.sum() + c.avg());
		
	}

}

interface Calculatable {
	public void setOprands (int first, int second, int third);
	public int sum();
	public int avg();
}

class CalculatorA implements Calculatable {
	int first, second, thrid;

	@Override
	public void setOprands(int first, int second, int third) {
		this.first = first;
		this.second = second;
		this.thrid = third;
	}

	@Override
	public int sum() {
		return this.first + this.second + this.thrid;
	}

	@Override
	public int avg() {
		return (this.first + this.second + this.thrid)/3;
	}
	
}
