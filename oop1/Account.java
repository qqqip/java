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

*/

public class Account {
	
	String owner;
	String accountNumber;
	int password;
	long balance;

	public int withdraw(int amount, int pwd) {
		boolean pwd = true;
		if (pwd) {
			System.out.println(owner + "��" + accountNumber + "���¿���" + amount + "�� �� ����մϴ�.");
		} else {
			System.out.println("�����մϴ�.");
		}
		return balance - amount;
	}
	
	public void deposit(int amount) {
		int result1 = amount + balance;	

			System.out.println("�����ܾ�: " + result1);	
	}

}