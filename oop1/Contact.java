public class Contact {
	// �Ӽ� �����ϱ�
	// ����
		int no;
	// �̸� 
		String name;
	// ����ó 
		String number;
	// �̸��� 
		String email;


	// ��� �����ϱ�
	// ��ȭ�ϱ� 
	public void call () {
		System.out.println(number + "(��)�� ��ȭ�մϴ�.");
	}

	// ���ں����� 
	public void sendMessage() {
		System.out.println(name + "���� ���ڸ� �����ϴ�.");
	}
	// ���Ϻ����� 
	public void sendMail() {
		System.out.println(email + "�� ���� �����ϴ�.");
	}
}