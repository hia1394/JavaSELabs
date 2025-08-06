package workshop.account.control;

import workshop.account.entity.Account;
import workshop.account.exception.InsufficientBalanceException;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account();

		account.setCustId("A1100");
		account.setAcctId("221-22-3477");
		account.deposit(1000);
		
		System.out.println(account.getCustId());
		System.out.println(account.getAcctId());
		System.out.println(account.getBalance());
		
		Account account2 = new Account("B1200","331-22-3477",2000);
		System.out.println(account2.getCustId());
		System.out.println(account2.getAcctId());
		System.out.println(account2.getBalance());
		
		System.out.println("10000원 입금");
		account2.deposit(10000);
		System.out.println("잔액= "+account2.getBalance());
		
		System.out.println("10000원 출금");
		try {
			account2.withdraw(10000);
			System.out.println("잔액= "+account2.getBalance());
			
			System.out.println("5000원 출금");
			account2.withdraw(5000);
			System.out.println("잔액= "+account2.getBalance());
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
