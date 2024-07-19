package Numbers_pgm;
import java.util.Scanner;

public class NumberTheory
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start= ");
		int start=sc.nextInt();
		System.out.println("Enter end= ");
		int end=sc.nextInt();
		
		int perfectCt=0;
		int deficitCt=0;
		int abundantCt=0;
		
		while (start<=end)
		{
			
			if (sumOfFactors(start)==start)
			{
				System.out.println(start+" Perfect number");
				perfectCt++;
				start++;
			}
			else if(sumOfFactors(start)<start)
			{
				System.out.println(start+" Deficit number");
				deficitCt++;
				start++;
			}
			
			else if(sumOfFactors(start)>start)
			{
				System.out.println(start+" Abundant number");
				abundantCt++;
				start++;
			}
		}
		System.out.println("count of perfect number= "+perfectCt);
		System.out.println("count of deficit number= "+deficitCt);
		System.out.println("count of abundant number= "+abundantCt);
		
	}
	
	public static int sumOfFactors(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if (num%i==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
}
