package assignment3.com;

	public class Account {

		private long accountNum;
		private double balance;
		public double deposit;

		public long getAccountNum() {
			return accountNum;
		}

		public void setAccountNum(long accountNum) {
			this.accountNum = accountNum;
		}

		public double getBalance() {
			return balance;
		}

		public void withdraw(double withd) {
			if (this.balance > withd) {
				this.balance = this.balance - withd;
			}else{
				System.out.println("Insufficient balance!");
			}
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}

		public double getDeposit() {
			return deposit;
		}

		public void setDeposit(double deposit) {
			this.balance = this.balance+deposit;
		}
	}




