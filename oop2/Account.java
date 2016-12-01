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
			조회기능 - 화면에 예금주, 계좌번호, 잔액을 표시한다. 

*/

public class Account {
	
	String owner;
	String accountNumber;
	int password;
	long balance;

	public int withdraw(int amount, int pwd) {
		int money = 0;
		if (password == pwd) {
			System.out.println("♥" + owner + "님의 " + accountNumber + " 계좌에서\t" + amount + "원을 출금합니다♥");
			System.out.println("♥" + owner + "님의 현재 잔액은" + balance + "원 입니다♥");
			balance -= amount;
			return amount;
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return 0;
		}
	}	
	public void deposit(int amount) {
		balance += amount;
		// balance = amount + balance;	

		System.out.println("현재잔액은 " + balance + "원 입니다.");	
	}
		public void info() {
		System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
		System.out.println("예금주 : " + owner);
		System.out.println("계좌번호 : " + owner);
		System.out.println("잔액 : " + balance);
		System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
	}
}

/*
정답:
	int money = 0;
	if (password == pwd) {
		if (balance >= amount) {
			balance -= amount);
			money = amount;
			System.out.println("출금 후 잔액: " + balance);
		} else {
			System.out.println("잔액이 부족합니다.")
		}
	} else {
		System.out.println("비밀번호가 일치하지 않습니다.");
		}
	return money;


2번째 - 아닌경우를 쳐내는 방법

	public int moneyout(int amount, int pwd) {
	
		if (password != pwd) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return =0;
		}
	
		if (balance < amount) {
			System.out.prinltn("잔액이 부족합니다.");
			return 0;
		}
		if(balance - amount < 100000) {
			System.out.println("최저 적립액이 부족합니다. ");
			return 0;
		}
	}
*/