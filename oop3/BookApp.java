public class BookApp {
	public static void main(String[] args) {
		
		Book[] bookCart = new Book[5];

		bookCart[0] = new Book(8,"����","������������", "�Ѹ���", 38000, "2001-01-23");
		bookCart[1] = new Book(8,"����","���ٻ�������", "�θ���", 11000, "2033-07-03");
		bookCart[2] = new Book(8,"ȭ��","������������", "������", 22055, "2035-08-11");
		bookCart[3] = new Book(8,"����","īŸ��������", "�׸���", 32500, "2056-03-18");
		bookCart[4] = new Book(8,"���","������������", "������", 99000, "2036-11-31");


		// īƮ�� ����� ��� å���� ������ ǥ���ϱ�
		for (Book b : bookCart) {
			System.out.println("å ����: " + b.getTitle() );
		}

		// īƮ�� ����� å���� ������ �� ���� ǥ���ϱ� 
		int total = 0;
		for (Book b : bookCart) {
			total += b.getPrice();
		}
			System.out.println("�� ����: " + total );

		// īƮ�� ����� å�߿��� ���� ��� ������ å ����� ������ ǥ���ϱ� 
		int expPrice = 0;
		String expTitle = null;

		for (Book b : bookCart) {
			if (b.getPrice() > expPrice) {
				expPrice = b.getPrice();
				expTitle = b.getTitle();
			}
		}
		System.out.println("������å����: " + expPrice);
		System.out.println("������å����: " + expTitle);
	}
}