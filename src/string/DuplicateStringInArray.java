package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateStringInArray 
{
public static void main(String[] args) 
{
	String[]strArray= {"Raj","Ravi","Rani","Rahul","Raj","Ram"};
	for(int i=0; i<strArray.length;i++)
	{
	String toCompare=strArray[i];
	for(int j=i+1;j<strArray.length;j++)
	{
		if(toCompare.equals(strArray[j]))
		{
			System.out.println("Duplicate Name is : " + toCompare);
		}
	}
}
}
}