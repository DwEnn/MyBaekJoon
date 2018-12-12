package DesignPattern;

import java.util.ArrayList;

/**
 * reference ( http://jusungpark.tistory.com/7 )
 * @author DwEnn
 *
 */

public class StrategyPatternEx {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		mallard.setFlyBehavior(new FlyNoWay());
		mallard.performFly();
		
	}

}

interface FlyBehavior {
	public void fly();
}

class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("�� �� - �� �� !!");
	}
	
}

class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("���� ���� ..");
	}
}

interface QuackBehavior {
	public void quack();
}

class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("�ٿ��ٿ�");
	}
	
}

class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println(" ... ");
	}
}

abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void swim() {
		System.out.println(" ���� �� �ִ� �� ..");
	}
	
	public abstract void display();
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
}

class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
		display();
	}
	
	@Override
	public void display() {
		System.out.println("û�տ��� �Դϴ�.");
	}
	
}