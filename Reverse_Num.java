package Numbers_pgm;
import java.util.Scanner;
public class Reverse_Num {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int rev=0;
		for(int i=num;i>0;i/=10)
		{
			rev=(rev*10)+(i%10);
		}
		System.out.println("Reverse of num= "+rev);
		
	}
	

}
