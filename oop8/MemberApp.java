public class MemberApp {
	public static void main(String[] args) {
		// ȸ�������� ��� ���� Member ��ü�� �����ϰ�
		// setter �� ����ؼ� �̸�, ���̵�, ���, ���� ���� �����͸� ��ü�� �����ϱ�

		Member a = new Member();

		a.setName("�����");
		a.setId("qq");
		a.setPassword("12345");
		a.setAge(25);
		
		// ������ Member ��ü�� ����� ���� getter �Լ��� ����ؼ� ȭ�鿡 ����ϱ�
		System.out.println("��" + a.getName() + "��");
		System.out.println(a.getId());
		System.out.println(a.getPassword());
		System.out.println(a.getAge());

	}
}