import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();
		Address addr = new Address();
		Tel a = new Tel();

		for (;;) {
			System.out.println("1.�̸����/���� 	2.��ȭ��ȣ���	 3.�ּҵ��/����  4.��ȸ	0.���� ");

			System.out.print("�޴��� �����ϼ���:");
			int no = sc.nextInt();
			if(no == 1) {
				System.out.println("1. �̸� ���	2. ����");
				System.out.print("�޴��� �����ϼ���:");
				int menu = sc.nextInt();

				if(menu == 1) {
					// �̸��� �Է¹޾Ƽ� Contact �� �����Ѵ�.	
					System.out.println("������ �̸��� �Է��ϼ���: ");
					String name = sc.next();
					contact.setName(name);
				} else  {
					System.out.println("�����ϰ� ���� �̸��� �Է��ϼ���: ");
					String name = sc.next();
					System.out.println("���� �� �̸�: ");
					String name2 = sc.next();
					contact.setName(name2);
					// ������ �̸��̶� ���� �����ֱ�
					System.out.println(contact.getName());
					}
			} else if (no ==2) {
				// ��ȭ��ȣ ������ �Է¹޾Ƽ� Contact�� �����մϴ�. 
				// Tel ��ü ����
				// �� �Է¹޾Ƽ� ä���
				System.out.println("����� ��ȭ��ȣ�� �Է��ϼ���: ");
				String number = sc.next();
				System.out.println("1. �ڵ���	2. ����		3. ��	4. ��Ÿ");
				String menu2 = sc.next();

				// Contact�� addTel(Tel tel)���� Tel ��ü �����ؼ� �迭�� ��� 
				a.setNumber(number);
				a.setType(menu2);
				contact.addTel(a);
				System.out.println(contact.getName() + a.getNumber());

			} else if (no == 3) {
				// �ּ� ������ �Է¹޾Ƽ� Contact�� �����մϴ�.
				System.out.println("������ �ּ��� �����ȣ�� �Է��ϼ���:");
				String zip = sc.next();
				System.out.println("������ �ּ��� ��/���� �Է��ϼ���:");
				String sd = sc.next();
				System.out.println("������ �ּ��� ��/���� �Է��ϼ���:");
				String gg = sc.next();
				System.out.println("������ �ּ��� ���ּҸ� �Է��ϼ���:");
				String dt = sc.next();

				// Address��ü ���� --> �� �Է¹޾Ƽ� ä��� -> Contact�� setter �̿��ؼ� ����
				addr.setZipcode(zip);
				addr.setSido(sd);
				addr.setGugun(gg);
				addr.setDetail(dt);

				contact.setAddress(addr);

			} else if(no == 4) {
				// ����ó ������ ȭ�鿡 ǥ���մϴ�.
				System.out.println("�̸�: " + contact.getName());
				System.out.println("��ȭ��ȣ: " + a.getType()+ a.getNumber());
				System.out.println("�ּ�: " + addr.getZipcode() + "\n" + addr.getSido() + "\n" + addr.getGugun() + "\n" + addr.getDetail() + "\n");
				ystem.out.println(Arrays.toString(cart));
				
			
			} else if(no == 0) {
				// ���α׷��� �����մϴ�. 
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}
}