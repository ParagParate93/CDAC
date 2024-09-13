package or.example.demo1.test1;

public class BankAccount{
	
	protected float accBalance;
	
	public void withdraw() {
		
	}
	
	public void deposit(float amnt) {
		accBalance += amnt;
	}
	
	public String toString() {
		return "Balance is: "+this.accBalance;
	}
	
}
