package com.java.constructor;
class AadharCard
{
	String name;
	int age;
	long mobileNo;
	AadharCard(String name, int age, long mobileNo)
	{
		System.out.println("A new a aadhar card has been generated......");
		this.name=name;
		this.age =age;
		this.mobileNo=mobileNo;
	}
}
public class MainClass2 
{
	public static void main(String[] args)
	{
		AadharCard a1= new AadharCard("M S DILLIWAL",25,8197950251l);
		System.out.println("Name="+a1.name);
		System.out.println("Age="+a1.age);
		System.out.println("MobileNO="+a1.mobileNo);
	}
}
