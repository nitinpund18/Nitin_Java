package loop;

public class ArmStrongNumberForLoop
{
	public static void main(String[] args) 
	{
		//int num=372,number,temp,total=0;
		int num=1631,number,temp,total=0;
		number=num;
		for(;number!=0;number/=10)
		{
			//temp=number%10;total=total+temp*temp*temp;
			temp=number%10;total=total+temp*temp*temp*temp;
		}
	if (total ==num)
		System.out.println(num +" : is an Armstrong number");
	else
		System.out.println(num +" : is not an Armstrong number");
}
	}