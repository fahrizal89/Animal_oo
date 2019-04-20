package com.fahrizal.example.animal.quack;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("--Silent--");
	}

}
