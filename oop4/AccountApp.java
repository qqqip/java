import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Account acc = new Account();	// 중요중요 중요 포문밖에 넣을건지 안에 넣을건지 

		for (;;) {
			System.out.println("1.등록	2.조회	3.비번변경	4.입금	5.출금	6.종료\n");

			System.out.print("메뉴 선택 > ");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				System.out.print("이름을 입력하세요: ");
				String name = sc.next();
				System.out.print("비밀번호를 입력하세요: ");
				int password = sc.nextInt();
				System.out.print("입금액을 입력하세요: ");
				int money = sc.nextInt();
				
				acc.setOwner(name);
				acc.setPassword(password);
				acc.setBalance(money);
				acc.setAccountNumber("1005-3444");
			
			} else if (menuNo == 2) {
				System.out.print("비밀번호를 입력하세요: ");
				int password = sc.nextInt();

				if( password == acc.getPassword()) {
					System.out.println("이름: " + acc.getOwner());
					System.out.println("계좌번호: 1005-3444");
					System.out.println("잔액: " + acc.getBalance());
				}
			
			} else if (menuNo == 3) {
				System.out.println("예전 비번을 입력하세요: ");
				int password = sc.nextInt()
				if( password == acc.getPassword()) {
					System.out.println("새 비밀번호를 입력하세요: ");
					int password = sc.nextInt();
				}
				System.out.println("비밀번호를 변경하였습니다.");
		
			} else if (menuNo == 4) {
				System.out.println("입금할 금액을 입력하세요: ");
				int amount = sc.nextInt();
				long newBalance = acc.getBalance() + amount;
				acc.setBalance(newBalance);
				System.out.println("잔액은: " + acc.getBalance());
			
			} else if (menuNo == 5) {
				System.out.println("비밀번호를 입력하세요: ");
				int password = sc.nextInt();
				System.out.println("출금할 금액을 입력하세요: ");
				int moneyout = sc.nextInt();
				long newBalance = acc.getBalance() - moneyout;
				acc.setBalance(newBalance);
				System.out.println("잔액은: " + acc.getBalance());
			
			} else if (menuNo == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
	}
}