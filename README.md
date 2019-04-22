# OO Design Pattern

Problem:
We have super class Duck and all ducks variants extends Duck.
Sometime, we need additional fly behavior.

1. Impossible to use method fly() on super class Duck, because not all variant ducks can fly.
2. Can’t using interface flyable, because it completely destroy code reuse for those behavior. 

Solutions:

OO Desin Principle
