import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo7 {
	public static void main(String[] args) {
		
		ArrayList<Product> cart = new ArrayList<Product>();

		cart.add(new Product(23, "����"));
		cart.add(new Product(12, "��å"));
		cart.add(new Product(17, "������"));
		cart.add(new Product(16, "å��ħ"));
		cart.add(new Product(11, "���찳"));

		// ��ǰ ��ȣ�� �����ϱ� 
		Collections.sort(cart);

		for (Product p : cart) {

			System.out.println(p);
		}

		System.out.println(cart);
	
	}
}