package loop;

import java.util.Scanner;

public class ArmstrongNumberForScanner
{
public static void main(String[] args) 
{
	int num,number,temp,total=0;
	System.out.println("Enter 4 digit number");
	//System.out.println("Enter 3 digit number");
	Scanner scnr=new Scanner(System.in);
	num=scnr.nextInt();
	number=num;
	for(; number!=0;number/=10)
	{
		temp=number%10;
		total=total+temp*temp*temp*temp;
		
//		temp=number%10;
//		total=total+temp*temp*temp;
	}
	if(total==num)
		System.out.println(num+" : is an Armstrong number");
	else
		System.out.println(num+" : is not an Armstrong number");
}
}
