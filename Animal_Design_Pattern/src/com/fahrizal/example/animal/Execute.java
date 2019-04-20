package com.fahrizal.example.animal;

import com.fahrizal.example.animal.duck.Duck;
import com.fahrizal.example.animal.duck.MalardDuck;
import com.fahrizal.example.animal.duck.fly.FlyRocketPowered;

public class Execute {
	public static void main(String[] args) {
		Execute execute = new Execute();
		execute.run();
	}
	
	public void run() {
		Duck malard= new MalardDuck();
		malard.performQuack();
		malard.performFly();
		malard.setFlyBehavior(new FlyRocketPowered());
		malard.performFly();
	}
}
