public class AccountApp {
	public static void main(String[] args) {
		Account a = new Account("soominsong", "1005-341-334679", 3290, 100000);

		// System.out.println("������: " + a.owner); // �ű��� ����ȵ�
		
		System.out.println("������: " + a.getOwner()); // getOwner�Լ� ����
		
		a.info();
		
	}
}