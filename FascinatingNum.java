package Numbers_pgm;
import java.util.Scanner;
public class FascinatingNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int ct=0;
		for(int i=num;i>0;i/=10)
		{
			ct++;
		}
		
		if (ct!=3)
		{
			System.out.println("The number cant be fascinating");
		} 
		
		else
		{
			int result1=num*2;
			int result2=num*3;
			
			String result=num+""+result1+result2;
			
			if (result.length()<9)
			{
				
				 
			}
			else
			{
				System.out.println("The number is not fascinating");
			}
			
			
			
			System.out.println(result);
		}
		
		
		
	}

}
