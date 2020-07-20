package demo;
import java.util.Scanner;

public class Sod {
	public static void main(String[]args)
	{
		int i,j,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		i=sc.nextInt();
		while(i>0)
		{
			j=i%10;
			sum=sum+j;
			i=i/10;
		}
		System.out.println("sod is:"+sum);
		
	}

}
