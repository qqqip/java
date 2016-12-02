import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo7 {
	public static void main(String[] args) {
		
		ArrayList<Product> cart = new ArrayList<Product>();

		cart.add(new Product(23, "연필"));
		cart.add(new Product(12, "공책"));
		cart.add(new Product(17, "색연필"));
		cart.add(new Product(16, "책받침"));
		cart.add(new Product(11, "지우개"));

		// 상품 번호로 정렬하기 
		Collections.sort(cart);

		for (Product p : cart) {

			System.out.println(p);
		}

		System.out.println(cart);
	
	}
}