public class Calculator {

	// ���� 2���� ���޹޾Ƽ� ���� ����ϰ� ��ȯ�ϴ� �޼ҵ�
	public int plus(int a, int b) {
		System.out.println("���� + ����");

		return a +b;
	}
	

	// �Ǽ� 2���� ���޹޾Ƽ� ���� ����ϰ� ��ȯ�ϴ� �޼ҵ�
	
	public double plus(double a, double b) {
		System.out.println("�Ǽ� + �Ǽ�");
		return a + b;	
	}

	// ���� 3���� ���޹޾Ƽ� ���� ����ϰ� ��ȯ�ϴ� �޼ҵ� 
	public int plus(int a, int b, int c) {
		System.out.println("���� + ���� + ����");

		return a + b + c;
	}


	// �Ǽ� 3���� ���޹޾Ƽ� ���� ����ϰ� ��ȯ�ϴ� �޼ҵ� 
	public double plus(double a, double b, double c) {
		System.out.println("�Ǽ� + �Ǽ� + �Ǽ� ");

		return a + b + c;
	}

}