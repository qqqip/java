public class PhotoPrinter extends Printer {
	
	int size;

	// �θ�Ŭ����(Printer)�� print() �޼ҵ� ������
	public void print(String data) {
		System.out.println("["+data+"]�� ������ȭ���� �μ��մϴ�.");
	}

	public void edit() {
		System.out.println("������ �����մϴ�.");
	}
}