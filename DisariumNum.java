package Numbers_pgm;
import java.util.Scanner;
public class DisariumNum 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num= ");
		int num=sc.nextInt();
		
		if (check(num))
		{
			System.out.println("It is a disarium num");
		} 
		else
		{
			System.out.println("It is not a disarium num");
		}
		
		
		
	}
	
	public static int count(int num)
	{
		int ct=0;
		while (num>0)
		{
			ct++;
			num/=10;
		}
		return ct;
	}
	
	public static int power(int base,int raise)
	{
		int pow=1;
		for(int i=1;i<=raise;i++)
		{
			pow*=base;
					
		}
		return pow;
	}
	
	public static int sumOfPower(int num)
	{
		int sum=0;
		int raise=count(num);
		while (num>0) 
		{
			int last=num%10;
			sum=sum+power(last,raise);
			
			raise--;
			num/=10;
		}
		System.out.println("sum= "+sum);
		return sum;
	}
	
	public static boolean check(int num)
	{
		return num==sumOfPower(num);
	}
}
