import java.util.ArrayList;

public class ArrayListDemo5 {
	public static void main(String[] args) {

		ArrayList<Product> cart = new ArrayList<Product>();

		Product p1 = new Product(1, "å");
		Product p2 = new Product(2, "����");
		Product p3 = new Product(3, "������");
		Product p4 = new Product(4, "ũ���Ľ�");
		
		cart.add(p1);
		cart.add(new Product(5, "���찳"));
		cart.add(p2);
		cart.add(p3);
		cart.add(p4);
		cart.add(new Product(6, "�ϸ�Ŀ"));
		
		// ArrayList�� ����� ��ü �߿��� ���� ��ǰ �����
		cart.remove(p2);
		
		// ArrayList�� ����� ��ü�߿��� [��ǰ��ȣ = 61, ��ǰ�� = "���찳"] ã�Ƽ� ����� 
		Product p = new Product(5, "���찳");	// �ؽ��ڵ尡 �ٸ���. 
		cart.remove(p);



		System.out.println(cart);

	}
}