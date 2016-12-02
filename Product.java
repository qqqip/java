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
	
	// �� ��ǰ��ȣ�� �ٸ� ��ǰ�� ��ǰ��ȣ�� ���ϴ� �ڵ� 
	public int compareTo(Product other) {
		return no - other.no;
	}


	// Objcet�� toString() ������ 
	public String toString() {
	return "Product[no="+no+", name="+name+"]";
	}
}