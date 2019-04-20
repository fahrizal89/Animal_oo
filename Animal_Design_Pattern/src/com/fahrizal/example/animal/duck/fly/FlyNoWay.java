package com.fahrizal.example.animal.duck.fly;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Ooopss! I can't fly");
	}

}
