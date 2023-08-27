package java.packages;

public class ClientPP extends Client {
	
	public String cpf;
	
	public void applyForPayrollLoan(double value) {
		double valueLimit = super.getLimit();
		if(valueLimit < value) {
			super.currentAccountBalance += value;
		}
	}
}
