package demo;
import java.util.Scanner;

public class Numbertodigit {
	public static void main(String[]args)
	{
		 Scanner input = new Scanner(System.in);
	        System.out.print("Input a number: ");
	        int n = input.nextInt();

	        String[] arr;
	    arr = new String[10];
	        arr[0]="zero";
	        arr[1]="one";
	        arr[2]="two";
	        arr[3]="three";
	        arr[4]="four";
	        arr[5]="five";
	        arr[6]="six";
	        arr[7]="seven";
	        arr[8]="eight";
	        arr[9]="nine";
	       
	    switch (n) {
	        case 0:
	            System.out.println("[" + n + "]:" + arr[0]);
	            break;
	        case 1:
	            System.out.println("[" + n + "]:" + arr[1]);
	            break;
	        case 2:
	            System.out.println("[" + n + "]:" + arr[2]);
	            break;
	        case 3:
	            System.out.println("[" + n + "]:" + arr[3]);
	            break;
	        case 4:
	            System.out.println("[" + n + "]:" + arr[4]);
	            break;
	        case 5:
	            System.out.println("[" + n + "]:" + arr[5]);
	            break;
	        case 6:
	            System.out.println("[" + n + "]:" + arr[6]);
	            break;
	        case 7:
	            System.out.println("[" + n + "]:" + arr[7]);
	            break;
	        case 8:
	            System.out.println("[" + n + "]:" + arr[8]);
	            break;
	        case 9:
	            System.out.println("[" + n + "]:" + arr[9]);
	            break;
	        default:
	            System.out.println("wrong input");
	            break;
	    }
	}
	}

	   
	    

