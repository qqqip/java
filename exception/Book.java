public class Book {
	private int no;
	private String title;
	private String author;
	private String pub;
	private int price;
	private String genre;

	public Book() {}

	public Book (int no, String title, String author, String pub, int price, String genre) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.pub = pub;
		this.price = price;
		this.genre= genre;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int Price) {
		this.price = price;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
}


