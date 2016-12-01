/*
	은행계좌를 표현하는 클래스 
		- 속성
			예금주
			계좌번호
			비밀번호
			잔액

		- 기능
			출금기능 - 금액과 비밀번호를 전달받아서 
						비밀번호가 개설시 입력한 비밀번호와 일치하면
						금액만큼을 잔액에서 감소시키고 
						금액만큼의 돈을 반환한다.
			
			입금기능 - 금액을 전달받아서 그금액만큼 잔액을 증가시키고 
						화면에 현재 잔액을 표시한다.

*/

public class Account {
	
	String owner;
	String accountNumber;
	int password;
	long balance;

	public int withdraw(int amount, int pwd) {
		boolean pwd = true;
		if (pwd) {
			System.out.println(owner + "의" + accountNumber + "계좌에서" + amount + "원 을 출금합니다.");
		} else {
			System.out.println("종료합니다.");
		}
		return balance - amount;
	}
	
	public void deposit(int amount) {
		int result1 = amount + balance;	

			System.out.println("현재잔액: " + result1);	
	}

}