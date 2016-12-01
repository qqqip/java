public class ProductApp {
	public static void main(String[] args) {
		
		Product p1 = new Product(10, "아이폰", "애플", 100000, 0.01);
		Product p2 = new Product(14, "맥북", "애플", 350000, 0.005);
		Product p3 = new Product(12, "아이패드", "애플", 220000, 0.003);

		p1.info();
		p2.info();
		p3.info();
	}
}