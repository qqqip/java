public class Banking {
	private String owner;
	private String accountNumber;
	private String password;
	private int balance;
	private boolean lock;

	public Banking(String owner, String accountNumber, String password, int balance, boolean lock) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.password = password;
		this.balance = balance;
		this.lock = lock;
	
	}

	public void changePassword(String oldPassword, String newPassword) throws BankingException {
	
		if (password.equals(oldPassword)) {
			password = newPassword;
		} else {
			throw new BankingException("비밀번호 변경 오류 [비밀번호 불일치]", "ERR01");
		}
	}

	public void fireAccount(String password) throws BankingException {
		if (this.password.equals(password)) {
			// 계좌를 사용을 중단시키기 
			lock = true;
		} else {
			throw new BankingException("계좌 해지 오류 [비밀번호 불일치]");
		}
	}
	public int withdraw(String password, int amount) throws BankingException {
		int withdrawAmount = 0;

		if (lock) {
			throw new BankingException("출금 중 오류[해지된 계좌입니다.]", "ERR02");
		} 
		if (!this.password.equals(password)) {
			throw new BankingException("출금 중 오류[비밀번호 불일치]", "ERR01");
		}
		
		if (balance < amount) {
			throw new BankingException("츨금 중 오류 [잔액 부족]", "ERR10");
		}

		balance -= amount;
		withdrawAmount = amount;

		return withdrawAmount;
	}

}