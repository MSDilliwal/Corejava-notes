package com.java.constructor;

class TrainTicket
{
	String from;
	String to;
	int cost;
	
	TrainTicket(String from,String to,int cost)
	{
		this.from= from;
		this.to = to;
		this.cost = cost;
	}
}
public class MainClass1 
{
   public static void main(String[] args)
   {
	System.out.println("TrainTicket is booked...");
	TrainTicket t= new TrainTicket("Gadag","Hubli",50);
	System.out.println("from="+t.from);
	System.out.println("to="+t.to);
	System.out.println("cost="+t.cost);
	
	System.out.println("TrainTicket is booked...");
	TrainTicket t1= new TrainTicket("Hubli","Gadag",50);
	System.out.println("from="+t1.from);
	System.out.println("to="+t1.to);
	System.out.println("cost="+t1.cost);
   }
}

/* it is an example of parameterized constructor here we can 
 * create multiple objects with different values while creating objects*/
