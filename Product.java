public class Product implements Comparable<Product> {
	private int no;
	private String name;

	public Product() {}
	public Product(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int hashCode() {
		return this.no;
	}
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (no != other.no)
			return false;
		return true;
	}
	
	// 내 상품번호와 다른 상품의 상품번호를 비교하는 코드 
	public int compareTo(Product other) {
		return no - other.no;
	}


	// Objcet의 toString() 재정의 
	public String toString() {
	return "Product[no="+no+", name="+name+"]";
	}
}