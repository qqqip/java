import java.util.ArrayList;

public class ArrayListDemo5 {
	public static void main(String[] args) {

		ArrayList<Product> cart = new ArrayList<Product>();

		Product p1 = new Product(1, "책");
		Product p2 = new Product(2, "연필");
		Product p3 = new Product(3, "색종이");
		Product p4 = new Product(4, "크레파스");
		
		cart.add(p1);
		cart.add(new Product(5, "지우개"));
		cart.add(p2);
		cart.add(p3);
		cart.add(p4);
		cart.add(new Product(6, "북마커"));
		
		// ArrayList에 저장된 객체 중에서 연필 상품 지우기
		cart.remove(p2);
		
		// ArrayList에 저장된 객체중에서 [상품번호 = 61, 상품명 = "지우개"] 찾아서 지우기 
		Product p = new Product(5, "지우개");	// 해시코드가 다르다. 
		cart.remove(p);



		System.out.println(cart);

	}
}