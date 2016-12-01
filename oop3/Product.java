public class Product {
	int no; 
	String name; 
	String manf; 
	int price; 
	double discount; 
	// boolean forsale; 

	public Product() {}

	public Product(int no, String name, String manf, int price, double discount) {
		this.no = no;
		this.name = name;
		this.manf = manf;
		this.price = price;
		this.discount = discount;
		// this.forsale = forsale;
	}
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	public String getManf() {
		return manf;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscount() {
		return discount;
	}
	public int getDiscountPrice() {
		return (int) (price * (1-discount));
	}

	public void info() {
		System.out.printf("%d %s %s %d %f\n",
							no, name, manf, price, discount);
	}
}
