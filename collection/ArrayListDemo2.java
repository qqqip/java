import java.util.*;

public class ArrayListDemo2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		// � �������� ũ�⸦ �̸� �������� �ʾƵ� �ȴ�. 
		ArrayList<String> names = new ArrayList<String>();
		

		while (true) {	// ���ǽ� ��� true�� �־� �׻� ������ ���� 
			System.out.println("1.��� 2.��ȸ 0.����");
			System.out.println("����>");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("����� �̸��� �Է��ϼ���: ");
				String name = sc.next();
				names.add(name);

			} else if (menu == 2) {
				for ( String a : names) {
					System.out.println(a);
				}

			} else if (menu == 0) {
				break;
			} 
		}
	}
}