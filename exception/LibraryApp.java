import java.util.Scanner;

public class LibraryApp{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library lib = new Library();

		while (true) {	// ���ѷ���
			System.out.println("----------------------------------------------------------------------");
			System.out.println("1.���	2.��ȣ�˻�	3.����˻�	4.�帣�˻�	0.����");
			System.out.println("----------------------------------------------------------------------");

			System.out.println("����>");
			int menu = Integer.parseInt(sc.nextLine());

			try {
				if (menu == 1) {
					System.out.println("��ȣ�� �Է��ϼ���");
					int no = Integer.parseInt(sc.nextLine());
					System.out.println("������ �Է��ϼ���");
					String title = sc.nextLine();
					System.out.println("���ڸ� �Է��ϼ���");
					String author = sc.nextLine();
					System.out.println("���ǻ縦 �Է��ϼ���");
					String pub = sc.nextLine();
					System.out.println("������ �Է��ϼ���");
					int price = Integer.parseInt(sc.nextLine());
					System.out.println("�帣�� �Է��ϼ���");
					String genre = sc.nextLine();

					Book book = new Book();
					// setter �̿��ؼ� å ���� ��� 

					book.setTitle(title);
					book.setNo(no);
					book.setAuthor(author);
					book.setPub(pub);
					book.setPrice(price);
					book.setGenre(genre);




					// library ��ü�� addBook(Book��ü) �����ؼ� �� ��ü �����ϱ� 
					lib.addBook(book);

				} else if (menu ==2) {
					System.out.println("��ȣ�� �Է��ϼ���");
					int no = Integer.parseInt(sc.nextLine());

					lib.findBooksByNo((no));
				
				} else if (menu ==3) {
					System.out.println("������ �Է��ϼ���");
					String title = sc.nextLine();

					lib.findBooksByTitle(title);
				
				} else if (menu ==4) {
					System.out.println("�帣�� �Է��ϼ���");
					String genre = sc.nextLine();

					lib.findBooksByGenre(genre);
				
				} else if (menu == 0 ) {
					break;
				}
			
			} catch(LibraryException e) {
				System.out.println("���� ���� ���α׷� ����");
				System.out.println("�����޼���: " + e.getMessage());

			} catch (Exception e) {
				System.out.println("�˷����� ���� ������ �߻��Ͽ����ϴ�.");
				System.out.println("���� �޼���: " + e.getMessage());
			}
		
		}
	}
}
