public class BookApp2 {
	public static void main(String[] args) {

		Book[] bookCart = new Book[2];
		
		Book book1 = new Book();	// book ��ü ����

		book1.setNo(23);
		book1.setTitle("�ϵ� �� �׼�");
		book1.setAuthor("ô��");
		book1.setPublisher("���ؼ�");
		book1.setPrice(33000);
		book1.setPubdate("2008-08-18");

		Book book2 = new Book();
		book2.setNo(25);
		book2.setTitle("�ڹ� �� ���α׷���");
		book2.setAuthor("���缺");
		book2.setPublisher("�������ǻ�");
		book2.setPrice(99000);
		book2.setPubdate("2016-08-18");

		bookCart[0] = book1;
		bookCart[1] = book2;

		for (Book book : bookCart) {
			System.out.printf("%s %s %d\n", book.getTitle(), book.getPublisher(), book.getPrice());
		}
	}
}