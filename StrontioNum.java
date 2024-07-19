package Numbers_pgm;
import java.util.Scanner;
public class StrontioNum 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num= ");
		int num=sc.nextInt();
		
		if (num>999 && num<10000)
		{
			int twice=num*2;
			System.out.println("twice= "+twice);
			
			int result=twice%1000;
			//System.out.println("result= "+result);
			result=result/10;
			//System.out.println("result= "+result);
			//
			System.out.println("result= "+result);
			if (result%11==0 || result==0)
			{
				System.out.println("Num is strontio num");
			} 
			else
			{
				System.out.println("Num is not strontio num");
			}
			
		}
		
		else
		{
			System.out.println("Num can't be strontio num");
		}
		
	}
	
	
	
}
