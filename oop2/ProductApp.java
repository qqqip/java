public class ProductApp {
	public static void min(String[] args) {
		
		// ��ǰ�� 5�� ��� �迭�� �����ϱ� 
		Product[] product = new Product[5]; 

		// �迭�� ��ǰ �ټ��� �����ϱ� 
		product[0] = new Product(2, "�ٳ���", "��", 4900, 5, true);
		product[1] = new Product(8, "����", "�س�", 5200, 7, true);
		product[2] = new Product(10, "����", "����", 4900, 10, true);
		product[3] = new Product(12, "����", "�Ľ���", 4900, 11, true);
		product[4] = new Product(22, "�丶��", "��ü��", 4900, 13, true);
		
		// �迭�� ����� ��ǰ�߿��� �Ǹ����� ��ǰ�� ǥ���ϱ� 
		for (Product a : product) {
			System.out.println("�Ǹ����� ��ǰ: " + a.name);
		}

		// �迭�� ����� ��ǰ�߿��� ������ 10000�� �̻��� ��ǰ�� ǥ���ϱ� 

		for (Product d : product) {
			if (d.salePrice() > 10000) {
				
			}
		}
		System.out.println("10000�� �̻��� ��ǰ:" + d.salePrice());


		// �迭�� ����� ��ǰ�� ��ü ������ ǥ���ϱ� 
		
		System.out.println("��ǰ�̸�: " + d.name + "����" + d.salePrice);
	}
}