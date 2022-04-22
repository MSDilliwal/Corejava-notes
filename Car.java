package com.java.abstraction;

// AN EXAMPLE FOR ACHIEVING ABSTRACTION BY USING ABSTRACT CLASS.....

abstract class Vehicle 
{
    abstract void start();
}  
class Bike 
{
    void start()
    {
    	System.out.println("Bike starts with kick.....");
    }
}
class Car extends Vehicle
{
    void start()
    {
    	System.out.println("Car starts with key....");
    }
    public static void main(String[] args) 
    {
		Car c1 = new Car ();
		c1.start();
		Bike b1 = new Bike ();
		b1.start();
		
	}
}


/*
  1) Inheritance (or)is - A relationship             
  2) Polymorphism 
     these 2 modules for REUSEABILITY of the code
     
  1) Encapsulation 
  2) Abstraction 
     these 2 modules for SECURITY of the code

IMP NOTE :-
We can achieve abstraction in two ways...
1) abstract class
2) interface

Definition :- ABSTRACTION is a nothing but hiding the implementation and highlighting the  
setup services.

Points :-
1) we can achieve 0-100%  abstraction by using abstract class.
   (combination of abstract class and concrete method will give 0% abstraction.
   where as combination of abstract class and abstract method will give 100% abstraction.)
2) METHOD OVERRIDING concept will be used. 
3) A METHOD without having BODY or IMPLEMENTATION is called as ABSTRACT METHOD.
4) If a class is having a abstract method,then the that class must be declared as an ABSTRACT CLASS.
5) But it is not mandatory to write abstract method inside the abstract class.
   i.e. we can have concrete method as well inside the abstract class.
6) If any normal class EXTENDS (inherits) from abstract class then it is COMPULSORY that all the 
   abstract methods should have IMPLEMENTATION inside the normal class ( OR ) we should declare 
   the class itself as an abstract class.
7) We can not create OBJECTS for abstract class.
*/

