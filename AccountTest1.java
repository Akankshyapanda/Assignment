package assignment3.com;

	import java.util.Scanner;

	public class AccountTest1 {

		public static void main(String[] args) {
			
			 Account details=new Account();
			   System.out.println("Enter the Acc.No.: ");
			   Scanner sc= new Scanner(System.in);
			   long accNo=sc.nextLong();
			   
			   details.setAccountNum(accNo);  
			   System.out.println("Enter the Balance:");
			   
			   double bal=sc.nextDouble();
			   details.setBalance(bal);
			   System.out.println("Enter the Deposite:");
			   
			   double dep=sc.nextDouble();
			   details.setDeposit(dep);
			   System.out.println("Enter Ammount to be withdrawn:");
			   
			   double witd=sc.nextDouble();
			   details.withdraw(witd);
			   System.out.println("Remaining Balance:"+details.getBalance());
			   sc.close();

		}

	}


