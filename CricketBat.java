package com.java.constructor;

 class CricketBat1 
{
   String brand;
   int cost;
   double size;
   CricketBat1()
   {
      System.out.println("Bat created...");
	   brand = "cucabura";
	   cost = 800;
	   size = 2.3;
   }
}
public class CricketBat 
{
public static void main(String[] args)
{
	CricketBat1 c1= new CricketBat1();
	System.out.println("brand="+c1.brand);
	System.out.println("size="+c1.size);
	System.out.println("cost="+c1.cost);
	
	CricketBat1 c2= new CricketBat1();
	System.out.println("brand="+c2.brand);
	System.out.println("size="+c2.size);
	System.out.println("cost="+c2.cost);
}
}
	

/* it is an example of zero arguments constructor here we 
 * can not create a new object with new values in the object creation time*/
 

