package com.StaticMethod;

public class StaticTest 
{
int x=20;
int y=30;
void display()
{
	System.out.println(x);
	System.out.println(y);
}
static void show()
{
	
}
public static void main(String[] args)
{
	StaticTest st=new StaticTest ();
	st.display();
	st.show();
}
}
