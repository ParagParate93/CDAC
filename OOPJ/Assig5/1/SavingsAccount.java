package or.example.demo1.test2;

import or.example.demo1.test1.BankAccount;

public class SavingsAccount extends BankAccount{
	
	private float limit=100000;
	
	public void withdraw(float amount) {
		if(accBalance>amount) {
			if(amount<limit) {
			accBalance -= amount;
			System.out.println("Withdrawl successful.");
			}
			else {
				System.out.println("Withdrawl amount greater than the limit.");
			}
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
}