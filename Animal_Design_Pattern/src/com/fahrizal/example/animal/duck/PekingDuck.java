package com.fahrizal.example.animal.duck;

import com.fahrizal.example.animal.duck.fly.FlyNoWay;
import com.fahrizal.example.animal.duck.quack.Quack;

public class PekingDuck extends Duck{
	public PekingDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("Show Peking duck");
	}
}
