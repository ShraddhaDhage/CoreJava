package numbersprograms;

import java.util.Scanner;

public class ArmstrongNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int ct=0;
		for(int i=num;i>0;i/=10)
		{
			ct++;
		}
		
		int sum=0;
		for(int i=num;i>0;i/=10)
		{
			int pow=1;
			int last=i%10;
			for(int j=0;j<ct;j++)
			{
				pow*=last;
			}
			sum+=pow;
		}
		
		if(sum==num)
		{
			System.out.println("It is an armstrong num");
		}
		else
		{
			System.out.println("Not armstrong");
		}
	}
}
