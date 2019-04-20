package com.fahrizal.example.animal.duck;

import com.fahrizal.example.animal.duck.fly.FlyWithWings;
import com.fahrizal.example.animal.duck.quack.Quack;

public class MalardDuck extends Duck{
	public MalardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("Show Malard duck");
	}
}
