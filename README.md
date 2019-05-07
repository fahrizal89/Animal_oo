# Strategy Pattern

Problem:

We have super class Duck and all ducks variants extends Duck.
Sometime, we need additional fly behavior and another behavior (quack).
Every duck can fly with another “special” skills. (Example : fly, can’t fly, fly Rocket powered, fly by wings).

1. Impossible to use method fly() on super class Duck, because not all variant ducks can fly.
2. Can’t using interface flyable, because it completely destroy code reuse for those behavior. 

Solutions:

OO Desin Principle

1. Duck have interface of Behaviour (example: FlyBehavior, QuackBehavior)
2. FlyBehavior have method fly.
3. Every ModelDuck extends Duck.
4. When instantiate model, set FlyBehavior by duck condition.
