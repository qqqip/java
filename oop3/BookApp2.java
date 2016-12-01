public class BookApp2 {
	public static void main(String[] args) {

		Book[] bookCart = new Book[2];
		
		Book book1 = new Book();	// book 객체 생성

		book1.setNo(23);
		book1.setTitle("하둡 인 액션");
		book1.setAuthor("척랩");
		book1.setPublisher("지앤선");
		book1.setPrice(33000);
		book1.setPubdate("2008-08-18");

		Book book2 = new Book();
		book2.setNo(25);
		book2.setTitle("자바 웹 프로그래밍");
		book2.setAuthor("박재성");
		book2.setPublisher("가메출판사");
		book2.setPrice(99000);
		book2.setPubdate("2016-08-18");

		bookCart[0] = book1;
		bookCart[1] = book2;

		for (Book book : bookCart) {
			System.out.printf("%s %s %d\n", book.getTitle(), book.getPublisher(), book.getPrice());
		}
	}
}