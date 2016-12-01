public class Book {
	
	// 은닉화된 속성 정의하기 
	private int no;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String pubdate;

	// 공개된 기능 정의하기 
	//기본 생성자 정의하기 
	public Book() {}

	// 모든 속성을 초기화하기 위해 매개변수 있는 생성자 정의하기 
	public Book(int no, String title, String author, String publisher, int price, String pubdate) {
	this.no = no;
	this.title = title;
	this.author = author;
	this.publisher = publisher;
	this.price = price;
	this.pubdate = pubdate;
	}

	// 모든 속성에 대한 각각의 getter함수 정의하기 
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
	

	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher (String publisher) {
		this.publisher = publisher;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice (int price) {
		if (price >=0) {
			this.price = price;
		} else {
			this.price = 0;
		}
	}


	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate (String pubdate) {
		this.pubdate = pubdate;
	}
}