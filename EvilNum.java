package Numbers_pgm;
import java.util.Scanner;

public class EvilNum 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num= ");
		int num=sc.nextInt();
		
		String bin="";
		for(int i=num;i>0;i/=2)
		{
			int last=i%2;
			bin=bin+last;
		}
		System.out.println("Binary Conversion= "+bin);
		
		
		
		
		
	}
}
