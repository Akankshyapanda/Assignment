package demo;
import java.util.Scanner;
public class Pallindrome {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int rem=0,rnum=0;
		int tnum=num;
		while(num!=0) {
			rem=num%10;
			rnum=rnum*10+rem;
			num=num/10;
						
		}
		if(rnum==tnum)
			System.out.print(rnum+" is palindrom number");
		else
			System.out.print(rnum+" is not a palindrom number");
		
	}
}
