package com.fahrizal.example.animal.duck;

import com.fahrizal.example.animal.duck.fly.FlyNoWay;
import com.fahrizal.example.animal.quack.Quack;

public class ModelDuck extends Duck{
	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("Show Model duck");
	}
}
