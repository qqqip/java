import java.util.ArrayList;

public class ProductRepository {
	
	ArrayList<Product> db = new ArrayList<Product> ();
	
	// ���ο� ��ǰ��ü�� ���޹޾Ƽ� 5�� ���ο��� ������ ArrayList�� �����ϴ� �޼ҵ�
	public void addProduct(Product item) {
		db.add(item);

	}

	// ��ǰ�̸��� ���޹޾Ƽ� ArrayList���� �� ��ǰ�̸��� �ش��ϴ� ��ǰ�� ã�Ƽ� ��ȯ�ϴ� �޼ҵ� 
	public Product findProduct(String name) {
		Product result = null;

		return result;
	}

	// ArrayList�� ����� ��� ��ǰ ������ ����ϴ� �޼ҵ� 
	public void displayProducts() {
		for (Product pro : db) {
			System.out.printf("%d %s\n", pro.getNo(), pro.getName());
		}
	}

}