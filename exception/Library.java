public class Library {
	private Book[] db = new Book[100];
	private int position = 0;	// 

	// addbook에서 db에 담고싶음
	public void addBook(Book newbook) throws LibraryException { //책 등록 (동일한번호의 책이 존재하면 예외 존재)
		
		for (Book book : db) {
			if(book !=null) { // 비었음으로 담을 수 있음
				if (book.getNo() == newbook.getNo()) {
					throw new LibraryException("동일한 책 번호가 존재합니다."); 
				}
			} 
		}
		db[position] = newbook;
		position++;
	}

	public void findBooksByNo(int no) throws LibraryException { // 책 번호로 찾기  (번호에 해당하는 책이 없으면 예외 발생)
		boolean isExist = false;	// 존재안한거 찾아지면 true
		
		for (Book b : db) {	// 책이 있으면 출력 
			if(b != null) {
				if (b.getNo() == no) {
					isExist = true;
					System.out.println(b.getTitle() + "\t" + b.getNo() + "\t" + b.getAuthor() + "\t" + b.getPrice() + "\t" + b.getGenre() + "\t" + b.getPub());
				}
			}
		}
		if (!isExist) { // 그 번호의 책이 없으면 
			throw new LibraryException("해당 번호의 책이 존재하지 않습니다."); 
		}
	}

	public void findBooksByTitle(String title) throws LibraryException {	// 책 이름으로 찾기 없으면 경고
		boolean isExist = false;
		
		for (Book b : db) {
			if(b !=null) {
				if (b.getTitle().contains(title)) {	// 문자열이 얻어지면 .을 찍을 수 있다. 
					isExist = true;
					System.out.println(b.getTitle() + "\t" + b.getNo() + "\t" + b.getAuthor() + "\t" + b.getPrice() + "\t" + b.getGenre() + "\t" + b.getPub());
				}
			} 
		}
		if (!isExist) { // 그 번호의 책이 없으면 
			throw new LibraryException("해당 제목의 책이 존재하지 않습니다."); 
		}
	}

	public void findBooksByGenre(String genre) throws LibraryException {
		boolean isExist = false;

		for (Book b : db) {	
			if(b != null) {
				if (b.getGenre() == genre) {
					isExist = true;
					System.out.println(b.getTitle() + "\t" + b.getNo() + "\t" + b.getAuthor() + "\t" + b.getPrice() + "\t" + b.getGenre() + "\t" + b.getPub());
				}
			}
		}
		if (!isExist) { 
			throw new LibraryException("해당 장르의 책이 존재하지 않습니다."); 
		}
	}
}

