import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		// �̸��� ������ ������ �� �ִ� ArrayList �����
		ArrayList<String> names = new ArrayList<String>();		// ���ڿ� 10�� ���� �� �ִ� ��ü�� ���������.

		// ArrayList�� String��ü �����ϱ� 
		names.add("�����");
		names.add("�����");
		names.add("�����");
		names.add("�����");
		names.add("�����");
		names.add("�����");
		names.add("�����");
		names.add("������");
		names.add("�̼���");
		names.add("���ð�");

		// ArrayList�� ����� ��� element �����ϱ�
		// names.clear();

		// AarrayList�� ����� element ���� ��ȸ�ϱ� 
		int len = names.size();
		System.out.println("����� ����: " + len);
			
		// ArrayList�� element�� ����Ǿ� �ִ��� Ȯ���ϱ�
		boolean empty = names.isEmpty();
		if (!empty) {
			System.out.println("element�� �����ϴ� ArrayList��.");
		} else {			
			System.out.println("����ִ� ArrayList��.");
		}

		for (String username : names) {
			System.out.println(username);
		}

		/*
		for (int i=0; i<len; i++) {
			String username = names.get(i);
			System.out.println(username);
		}
		*/
		/*
		String name1 = names.get(0);
		String name2 = names.get(1);
		String name3 = names.get(2);
		String name4 = names.get(3);
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		*/
	}
}