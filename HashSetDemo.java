import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		
		// �޴� �̸��� �����ϴ� HashSet��ü ����� 
		HashSet<String> menuset = new HashSet<String>();

		boolean r = false;
		r = menuset.add("�ұ���");
		System.out.println("�ұ��� ---> " + r);

		menuset.add("�ұ���");
		menuset.add("�ұ���");
		menuset.add("�ұ���");
		menuset.add("�ұ���");
		menuset.add("�ұ���");
		menuset.add("�ұ���");
		menuset.add("�ſ���");
		menuset.add("Į����");
		menuset.add("��������");
		menuset.add("�������");

		r = menuset.add("�ſ���");
		System.out.println("�ſ��� ---> " + r);

		int len = menuset.size();
		System.out.println(len);

		for (String menu : menuset) {
			System.out.println(menu);
		}
	}
}

// HashSet�� ArrayList �� ������ �Ȱ���. �ٸ�, ArrayList�� ��������