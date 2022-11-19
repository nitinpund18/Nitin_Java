package string;

public class CharacterCountOccurance 
{
public static void main(String[] args)
{
	String s="nitin pund";
	int totalCount =s.length();
	int totalCount_afterRemove=s.replace("i", "").length();
	int count=totalCount-totalCount_afterRemove;
	System.out.println("Number of Occurances of n is : "+count);
}
}


