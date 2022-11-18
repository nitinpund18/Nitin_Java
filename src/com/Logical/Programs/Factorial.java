package com.Logical.Programs;

public class Factorial
{
public static void main(String[] args) 
{
	int num=3;
	int fact=1;
	for(int i=num;i>1;i--)
	{
		fact=fact*i;
	}
	System.out.println(fact);
}
}
//1*2*3*4*5