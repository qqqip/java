public class Library {
	private Book[] db = new Book[100];
	private int position = 0;	// 

	// addbook���� db�� ������
	public void addBook(Book newbook) throws LibraryException { //å ��� (�����ѹ�ȣ�� å�� �����ϸ� ���� ����)
		
		for (Book book : db) {
			if(book !=null) { // ��������� ���� �� ����
				if (book.getNo() == newbook.getNo()) {
					throw new LibraryException("������ å ��ȣ�� �����մϴ�."); 
				}
			} 
		}
		db[position] = newbook;
		position++;
	}

	public void findBooksByNo(int no) throws LibraryException { // å ��ȣ�� ã��  (��ȣ�� �ش��ϴ� å�� ������ ���� �߻�)
		boolean isExist = false;	// ������Ѱ� ã������ true
		
		for (Book b : db) {	// å�� ������ ��� 
			if(b != null) {
				if (b.getNo() == no) {
					isExist = true;
					System.out.println(b.getTitle() + "\t" + b.getNo() + "\t" + b.getAuthor() + "\t" + b.getPrice() + "\t" + b.getGenre() + "\t" + b.getPub());
				}
			}
		}
		if (!isExist) { // �� ��ȣ�� å�� ������ 
			throw new LibraryException("�ش� ��ȣ�� å�� �������� �ʽ��ϴ�."); 
		}
	}

	public void findBooksByTitle(String title) throws LibraryException {	// å �̸����� ã�� ������ ���
		boolean isExist = false;
		
		for (Book b : db) {
			if(b !=null) {
				if (b.getTitle().contains(title)) {	// ���ڿ��� ������� .�� ���� �� �ִ�. 
					isExist = true;
					System.out.println(b.getTitle() + "\t" + b.getNo() + "\t" + b.getAuthor() + "\t" + b.getPrice() + "\t" + b.getGenre() + "\t" + b.getPub());
				}
			} 
		}
		if (!isExist) { // �� ��ȣ�� å�� ������ 
			throw new LibraryException("�ش� ������ å�� �������� �ʽ��ϴ�."); 
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
			throw new LibraryException("�ش� �帣�� å�� �������� �ʽ��ϴ�."); 
		}
	}
}

