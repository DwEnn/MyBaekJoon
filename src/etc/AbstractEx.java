package etc;

/**
 * reference 생활코딩 ( https://opentutorials.org/course/1223/6062 )
 * @author DwEnn
 *
 */

public class AbstractEx {

	public static void main(String[] args) {
		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		c1.setOprands(10, 20);
		c1.run();
		
		CalculatorDecoMinus c2 = new CalculatorDecoMinus();
		c2.setOprands(10, 20);
		c2.run();
		
	}

}

abstract class Calculator {
	private int left, right;
	
	protected void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	protected abstract void sum();
	protected abstract void avg();
	protected void run() { 
		sum();
		avg();
	}
	
	protected int sumNum() {
		return left+right;
	}
}

class CalculatorDecoPlus extends Calculator {

	@Override
	public void sum() {
		System.out.println("+ sum : " + (sumNum()));
	}

	@Override
	public void avg() {
		System.out.println("+ avg : " + (sumNum()));
	}
	
}

class CalculatorDecoMinus extends Calculator {

	@Override
	public void sum() {
		System.out.println("- sum : " + (sumNum()));
	}

	@Override
	public void avg() {
		System.out.println("- avg : " + (sumNum()));
	}
	
}


