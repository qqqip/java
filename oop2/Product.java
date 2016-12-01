public class Product {

	// 속성
	int no; // 상품번호
	String name; // 상품명
	String manf; // 제조사 
	int price; // 가격
	double discount; // 할인율
	boolean forsale; // 판매여부 

    
	// 생성자 >> 기본생성자, 매개변수 있는 생성자 
	public Product() {
	}
	public Product(int a, String b, String c, int d, double e, boolean f) {
		no = a;
		name = b;
		manf = c;
		price = d;
		discount = e;
		forsale = f;
	}

	// 기능 
	// 할인된 가격을 반환하는 메소드 (형변환)
	public double salePrice() { //int 4byte double 8byte
		double salePrice = 0; 
		salePrice = (int)(price - (price*discount));
			return salePrice;
	} 
	
	// 상품정보를 모두 출력하는 메소드 (할인가 포함)
	public void infoProduct() {
		System.out.println("상품번호: " + no);
		System.out.println("상품명: " + name);
		System.out.println("제조사: " + manf);
		System.out.println("가격: " + price);
		System.out.println("할인율: " + discount);
		System.out.println("판매여부: " + forsale);
	
	}
}