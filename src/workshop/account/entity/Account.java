package workshop.account.entity;

public class Account {
	private String custId;
	private String acctId;
	private int balance;

	public Account() {
		System.out.println("�⺻������ ȣ��");
	}

	public Account(String custId, String acctId, int balance) {

//		this.custId = custId;
//		this.acctId = acctId;
		setCustId(custId);
		setAcctId(acctId);
		this.balance = balance;
	}

//	public void setBalance(int newBalance) {
//		balance = newBalance;
//	}
	private void getbalacne() {
		return balance;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String cstId) {
		this.custId = custId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public String getAcctId() {
		return acctId;
	}

	// �Ա�
	public void deposit(int amount) {
		this.balance += amount;
	}

	// ���
	public void withdraw(int amount) {
		this.balance -= amount;
	}
}
