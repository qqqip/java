public class Product {

	// �Ӽ�
	int no; // ��ǰ��ȣ
	String name; // ��ǰ��
	String manf; // ������ 
	int price; // ����
	double discount; // ������
	boolean forsale; // �Ǹſ��� 

    
	// ������ >> �⺻������, �Ű����� �ִ� ������ 
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

	// ��� 
	// ���ε� ������ ��ȯ�ϴ� �޼ҵ� (����ȯ)
	public double salePrice() { //int 4byte double 8byte
		double salePrice = 0; 
		salePrice = (int)(price - (price*discount));
			return salePrice;
	} 
	
	// ��ǰ������ ��� ����ϴ� �޼ҵ� (���ΰ� ����)
	public void infoProduct() {
		System.out.println("��ǰ��ȣ: " + no);
		System.out.println("��ǰ��: " + name);
		System.out.println("������: " + manf);
		System.out.println("����: " + price);
		System.out.println("������: " + discount);
		System.out.println("�Ǹſ���: " + forsale);
	
	}
}