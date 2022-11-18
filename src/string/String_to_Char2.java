package string;

public class String_to_Char2 
{
public static void main(String[] args)
{
	String s="nitin";
	for(int i=0; i<s.length();i++)
	{
		char c=s.charAt(i);
		System.out.println("char at : "+i + " index is : "+c);
	}
}
}
