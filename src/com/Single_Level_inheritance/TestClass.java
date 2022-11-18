package com.Single_Level_inheritance;

public class TestClass
{
	public static void main(String[] args)
{	
		Parent p=new Parent();
		p.bunglow();
		p.farm();
		
		Child c=new Child();
		c.iphone();
		c.bunglow();
		c.farm();
}
}
