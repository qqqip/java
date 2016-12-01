import java.util.Scanner;

public class AccountApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Account acc = new Account();	// �߿��߿� �߿� �����ۿ� �������� �ȿ� �������� 

		for (;;) {
			System.out.println("1.���	2.��ȸ	3.�������	4.�Ա�	5.���	6.����\n");

			System.out.print("�޴� ���� > ");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				System.out.print("�̸��� �Է��ϼ���: ");
				String name = sc.next();
				System.out.print("��й�ȣ�� �Է��ϼ���: ");
				int password = sc.nextInt();
				System.out.print("�Աݾ��� �Է��ϼ���: ");
				int money = sc.nextInt();
				
				acc.setOwner(name);
				acc.setPassword(password);
				acc.setBalance(money);
				acc.setAccountNumber("1005-3444");
			
			} else if (menuNo == 2) {
				System.out.print("��й�ȣ�� �Է��ϼ���: ");
				int password = sc.nextInt();

				if( password == acc.getPassword()) {
					System.out.println("�̸�: " + acc.getOwner());
					System.out.println("���¹�ȣ: 1005-3444");
					System.out.println("�ܾ�: " + acc.getBalance());
				}
			
			} else if (menuNo == 3) {
				System.out.println("���� ����� �Է��ϼ���: ");
				int password = sc.nextInt()
				if( password == acc.getPassword()) {
					System.out.println("�� ��й�ȣ�� �Է��ϼ���: ");
					int password = sc.nextInt();
				}
				System.out.println("��й�ȣ�� �����Ͽ����ϴ�.");
		
			} else if (menuNo == 4) {
				System.out.println("�Ա��� �ݾ��� �Է��ϼ���: ");
				int amount = sc.nextInt();
				long newBalance = acc.getBalance() + amount;
				acc.setBalance(newBalance);
				System.out.println("�ܾ���: " + acc.getBalance());
			
			} else if (menuNo == 5) {
				System.out.println("��й�ȣ�� �Է��ϼ���: ");
				int password = sc.nextInt();
				System.out.println("����� �ݾ��� �Է��ϼ���: ");
				int moneyout = sc.nextInt();
				long newBalance = acc.getBalance() - moneyout;
				acc.setBalance(newBalance);
				System.out.println("�ܾ���: " + acc.getBalance());
			
			} else if (menuNo == 6) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

		}
	}
}