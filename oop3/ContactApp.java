import java.util.Scanner;

public class ContactApp {	// ����ó ������ �Է¹޴� ȭ�� Ŭ����
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);	// ������� �Է��� �о���� Scanner ��ü �����ϱ� 
		
		Contact[] contacts = new Contact[100];
		int currentPosition = 0;	// �迭�� �ڸ���

		
		for (;;) {	// ���� 3�� �Է��� ���� ����
			System.out.println("1:��� 2:��ȸ 0:����");
			System.out.println("�޴� ��ȣ�� �Է��ϼ���");
			int menuNo = sc.nextInt();
			
			if (menuNo == 1) {	// �迭�� ����ϱ�	// currentPosition�� ����Ű�� ��ġ�� Contact�� �����ϰ� currentPosition�� ���� 1 ������Ų��. 
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
				
				// �迭�� �����ϱ�
				contacts[currentPosition]  = contact;
				currentPosition++;


			} else if (menuNo == 2) {	// �迭�� ����� ��� ����ó ���� ǥ���ϱ�- ����� ���� ����ϸ� ���� // �迭���� 0���� currentPosition�� ����Ű�� ��ġ �ձ��� �ݺ��ؼ� ���
				for (int i=0; i<currentPosition; i++) {
					Contact c = contacts[i];

					System.out.printf("%d %s %s %s\n",
							c.getNo(), c.getName(), c.getPhone(), c.getEmail());
				}
			} else if (menuNo == 0) {
				break;
			}
		}
	}
}