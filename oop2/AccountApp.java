public class AccountApp {
	public static void main(String[] args) {
		Account a = new Account();
		
		a.owner = "�����";
		a.accountNumber = "1002-341-441570";
		a.password = 4579;
		a.balance = 400;

		int money = a.withdraw(5000,4579);
		System.out.println("��ݾ�: " + money);

		a.deposit(30000);

		a.info();
		
	}
}