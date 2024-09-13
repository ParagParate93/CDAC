package or.example.demo1;
import or.example.demo1.test2.SavingsAccount;
/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		sa.deposit(150000);
		System.out.println(sa.toString());
		sa.withdraw(45000.50f);
		System.out.println(sa.toString());

	}

}
