/*
	������¸� ǥ���ϴ� Ŭ���� 
		- �Ӽ�
			������
			���¹�ȣ
			��й�ȣ
			�ܾ�

		- ���
			��ݱ�� - �ݾװ� ��й�ȣ�� ���޹޾Ƽ� 
						��й�ȣ�� ������ �Է��� ��й�ȣ�� ��ġ�ϸ�
						�ݾ׸�ŭ�� �ܾ׿��� ���ҽ�Ű�� 
						�ݾ׸�ŭ�� ���� ��ȯ�Ѵ�.
			
			�Աݱ�� - �ݾ��� ���޹޾Ƽ� �ױݾ׸�ŭ �ܾ��� ������Ű�� 
						ȭ�鿡 ���� �ܾ��� ǥ���Ѵ�.
			��ȸ��� - ȭ�鿡 ������, ���¹�ȣ, �ܾ��� ǥ���Ѵ�. 

*/

public class Account {
	
	String owner;
	String accountNumber;
	int password;
	long balance;

	public int withdraw(int amount, int pwd) {
		int money = 0;
		if (password == pwd) {
			System.out.println("��" + owner + "���� " + accountNumber + " ���¿���\t" + amount + "���� ����մϴ٢�");
			System.out.println("��" + owner + "���� ���� �ܾ���" + balance + "�� �Դϴ٢�");
			balance -= amount;
			return amount;
		} else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			return 0;
		}
	}	
	public void deposit(int amount) {
		balance += amount;
		// balance = amount + balance;	

		System.out.println("�����ܾ��� " + balance + "�� �Դϴ�.");	
	}
		public void info() {
		System.out.println("����������������������������");
		System.out.println("������ : " + owner);
		System.out.println("���¹�ȣ : " + owner);
		System.out.println("�ܾ� : " + balance);
		System.out.println("����������������������������");
	}
}

/*
����:
	int money = 0;
	if (password == pwd) {
		if (balance >= amount) {
			balance -= amount);
			money = amount;
			System.out.println("��� �� �ܾ�: " + balance);
		} else {
			System.out.println("�ܾ��� �����մϴ�.")
		}
	} else {
		System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
	return money;


2��° - �ƴѰ�츦 �ĳ��� ���

	public int moneyout(int amount, int pwd) {
	
		if (password != pwd) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			return =0;
		}
	
		if (balance < amount) {
			System.out.prinltn("�ܾ��� �����մϴ�.");
			return 0;
		}
		if(balance - amount < 100000) {
			System.out.println("���� �������� �����մϴ�. ");
			return 0;
		}
	}
*/