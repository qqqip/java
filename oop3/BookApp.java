public class BookApp {
	public static void main(String[] args) {
		
		Book[] bookCart = new Book[5];

		bookCart[0] = new Book(8,"마음","가나다지은이", "한마음", 38000, "2001-01-23");
		bookCart[1] = new Book(8,"졸림","마바사지은이", "두마음", 11000, "2033-07-03");
		bookCart[2] = new Book(8,"화남","아자차지은이", "세마음", 22055, "2035-08-11");
		bookCart[3] = new Book(8,"슬픔","카타파지은이", "네마음", 32500, "2056-03-18");
		bookCart[4] = new Book(8,"기쁨","하하하지은이", "오마음", 99000, "2036-11-31");


		// 카트에 저장된 모든 책들의 제목을 표시하기
		for (Book b : bookCart) {
			System.out.println("책 제목: " + b.getTitle() );
		}

		// 카트에 저장된 책들의 가격의 총 합을 표시하기 
		int total = 0;
		for (Book b : bookCart) {
			total += b.getPrice();
		}
			System.out.println("총 가격: " + total );

		// 카트에 저장된 책중에서 가장 비싼 가격의 책 제목과 가격을 표시하기 
		int expPrice = 0;
		String expTitle = null;

		for (Book b : bookCart) {
			if (b.getPrice() > expPrice) {
				expPrice = b.getPrice();
				expTitle = b.getTitle();
			}
		}
		System.out.println("가장비싼책가격: " + expPrice);
		System.out.println("가장비싼책제목: " + expTitle);
	}
}