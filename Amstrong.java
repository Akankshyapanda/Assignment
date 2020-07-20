package demo;
import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		System.out.println("enter the number ");
		Scanner sc=new Scanner(System.in);
		String num= sc.nextLine();
		int len= num.length();
		int n= Integer.parseInt(num);
		int temp=n;
		int rem,pow,sum=0;
		for (int i=0;i<len;i++)
		{
			rem=n%10;
			pow=(int)Math.pow(rem, len);
			sum=sum+pow;
			n=n/10;	
			
			
		}
		if(sum==temp) 
			System.out.println(temp+" is a armstrong number");
		else
			System.out.println(temp+" is not a armstrong number");
		
	
	}

}

