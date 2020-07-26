package assignment6.com;

public class ExceptionTest {
	   public static void main(String args[])
	   {
		   int n1=30, n2=0, r;
			try {
				n1 = Integer.parseInt(args[0]);
			} catch (Exception ex) {
				System.out.println("A number was not entered.");
				System.exit(0);
			}
			try {
				n2 = Integer.parseInt(args[1]);
			} catch (Exception ex) {
				System.out.println("A number was not entered.");
				System.exit(0);
			}
			try {
				r= n1 / n2;
			} catch (ArithmeticException ex) {
				System.out.println("Division with zero is not possible");
			}
	   }
}