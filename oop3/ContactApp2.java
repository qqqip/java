import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Contact[] contacts = new Contact[100];
		ContactMgr mgr = new ContactMgr();

		for (;;) {
			System.out.println("1:��� 2:��ȸ 0:����");

			System.out.println("�޴� ��ȣ�� �Է��ϼ���");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {// mgr�� addContact(Contact contact) �޼ҵ忡 ����� Contact ��ü �����ϱ� 
			
				// ����ó ���� ��Ϲޱ� 
				System.out.print("��ȣ�� �Է��ϼ���: ");
				int no = sc.nextInt();
				System.out.print("�̸��� �Է��ϼ���: ");
				String name = sc.next();
				System.out.print("��ȭ��ȣ�� �Է��ϼ���: ");
				String phone = sc.next();
				System.out.print("�̸��� �Է��ϼ���: ");
				String email = sc.next();

				// Contact ��ü �����ϰ�, ���� ��� 
				Contact contact = new Contact();
				contact.setNo(no);
				contact.setName(name);
				contact.setPhone(phone);
				contact.setEmail(email);
				
				mgr.addContact(contact);

			} else if (menuNo == 2) {	// ��� ���� ǥ���ϱ�	// mgr�� displayContact()�� �����Ű��
				mgr.displayContact();
			
			} else if (menuNo ==3) {
				break;
			}
		}
	}
}








