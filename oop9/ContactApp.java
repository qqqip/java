public class ContactApp {
	public static void main(String[] args) {
		
		// �ּҷ�����(�̸�, �������� ��ȭ��ȣ, �ּ�)�� �����ϴ� ��ü ����
		Contact contact = new Contact();
		
		// �̸� ���� ����
		String name = "�����";
		contact.setName(name);

		// ��ȭ��ȣ ���� ����
		Tel[] phones = new Tel[10];

		Tel tel1 = new Tel();
		tel1.setType("��");
		tel1.setNumber("010-222-2222");
		phones[0] = tel1;

		Tel tel2 = new Tel();
		tel2.setType("����");
		tel2.setNumber("02-1234-5678");
		phones[1] = tel2;

		// �迭�� �־���
		contact.setTels(phones);

		// �ּ� ���� ����
		Address addr = new Address();
		addr.setSido("���� Ư����");
		addr.setGugun("���α�");
		addr.setDetail("���͵� ��Ƹ����� 401ȣ");

		contact.setAddress(addr);

	}
}