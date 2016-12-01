public class ProductApp2 {
	public static void main(String[] args) {
	
		Product p1 = new Product("����", 500);
		Product p2 = new Product("����", 500);
		
		// ==�� equals(Object o)�� ���� ��ü���� �� 
		boolean result1 = (p1 == p2);
		boolean result2 = p1.equals(p2);

		System.out.println("==	   ��: " + result1);
		System.out.println("equals ��: " + result2);

		// �ؽ��ڵ尪 ��ȸ
		int value1 = p1.hashCode();
		int value2 = p2.hashCode();
		System.out.println("�ؽ��ڵ尪: " + value1);
		System.out.println("�ؽ��ڵ尪: " + value2);

		// toString 
		String str1 = p1.toString();
		String str2 = p2.toString();
		System.out.println("��ü ����: " + str1);
		System.out.println("��ü ����: " + str2);

		System.out.println(p1);	// System.out.println(p1.toString());
		System.out.println(p2);	// System.out.println(p2.toString());
	}
}