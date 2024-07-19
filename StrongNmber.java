package numbersprograms;

import java.util.Scanner;

public class StrongNmber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		int ct=0;
		for(int i=0;i>num;i/=10)
		{
			ct++;
		}
		
		int sum=0;
		for(int i=num;i>0;i/=10)
		{
			
			int fact=1;
			int last=i%10;
			System.out.println(last);
			for(int j=last;j>0;j--)
			{
				fact*=j;
				
			}
			sum+=fact;
			System.out.println("sum="+sum);
		}
		System.out.println(sum);
		if(num==sum)
		{
			System.out.println("It is a strong number");
		}
		else
		{
			System.out.println("Not a strong number");
		}
	}
}
