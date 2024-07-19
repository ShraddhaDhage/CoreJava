package Numbers_pgm;

public class MakePrime 
{
	public static boolean isPrime(int num)
	{
		int deno;
		for( deno=2;deno<=num;deno++)
		{
			if(num%deno==0)
			{
				break;
			}	
		}
		
		if(num==deno)
		{
			return true;
		}
		return false;
		
	}
	
	
	
	public static void main(String[] args) 
	{
		int num=23;
		int ct=0;
		for(int i=num; ;i++)
		{
			if(!(isPrime(i)))
			{
				ct++;
			}
			else 
			{
				System.out.println("It is  prime");
				break;
			}
		}
		System.out.println("to make "+num+" prime add  "+ct);
	}
}
