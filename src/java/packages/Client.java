package java.packages;

public class Client {

	public int agence;
	public String checkingAccount;
	public double currentAccountBalance;

	public void withdrawCheckingAccount(double value) {
		if(this.currentAccountBalance >= value) {
			this.currentAccountBalance -= value;
		}
	}
	public double getLimit() {
		return 1000.00;
	}
}
