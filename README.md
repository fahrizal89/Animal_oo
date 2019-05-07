# Strategy Pattern

>Define family of algorithm, encapsulates each one, and make them interchangeable.
>Strategy lets the algorithm vary independently from clients tha use it.

Problem:

We have super class Duck and all ducks variants extends Duck.
Sometime, we need additional fly behavior and another behavior (quack).
Every duck can fly with another “special” skills. (Example : fly, can’t fly, fly Rocket powered).

1. Impossible to use method fly() on super class Duck, because not all variant ducks can fly.
2. Can’t using interface flyable, because it completely destroy code reuse for those behavior. 

Solutions:

Use "Strategy Pattern"

1. Make Duck as abstract class and have behavior
```
public abstract class Duck {
	FlyBehavior flyBehavior;
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
  
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
}
```
2. Create interface of Behaviour (FlyBehavior)
```
public interface FlyBehavior {
	void fly();
}
```
3. FlyNoWay,FlyRoketPowered and FlyByWings implements FlyBehavior.
```
public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Ooopss! I can't fly");
	}

}
```
```
public class FlyRocketPowered implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I'm fly using rocket");
	}

}
```
```
public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}

}
```
4. Every ModelDuck extends Duck.
```
public class MalardDuck extends Duck{
	public MalardDuck(){
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("Show Malard duck");
	}
}
```
5. When instantiate model, set FlyBehavior by duck condition.
```
Duck malard= new MalardDuck();
malard.setFlyBehavior(new FlyRocketPowered());
malard.performFly();
```
