package string;

public class ReverseNumber
{
public static void main(String[] args) 
{
		int[]a= {1,2,3,4,5,6,7,8};
		System.out.print("Original array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Array in revers array:");
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.print(a[j]+" ");
		}
	}
}