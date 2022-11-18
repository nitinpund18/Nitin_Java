package com.SuperThisKeyword;

public class Child extends Parent
{
	int a=50;
	int j=60;
public void method()
{
	int a=70;
	int b=80;
	int k=10;
	
	int sum =super.a+this.a;
	int add= super.b+this.b;
	
	System.out.println(sum);
	System.out.println("a="+a);
	System.out.println("Global a from child class="+ this .a);
	System.out.println("Global a from parent class ="+ super.a);
}
public static void main(String[] args)
{
	Child c=new Child();
	c.method();
	
	Sample s=new Sample();
	System.out.println(s.a);
	System.out.println(s.b);
}
}
