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
		System.out.println("난 다 - 날 아 !!");
	}
	
}

class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("날지 못함 ..");
	}
}

interface QuackBehavior {
	public void quack();
}

class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("꾸웍꾸웍");
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
		System.out.println(" 물에 떠 있는 중 ..");
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
		System.out.println("청둥오리 입니다.");
	}
	
}