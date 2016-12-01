public class Account {
	private String owner;
	private String accountNumber;
	private int password;
	private long balance;

	public Account() {}

	public Account(String owner, String accountNumber, int password, long balance) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.password = password;
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String account) {
		this.accountNumber = accountNumber;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
}
