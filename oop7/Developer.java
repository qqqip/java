public class Developer extends Employee {
	
	int todo;
	int completed;


	// ���߿� �°� print() �޼ҵ� �������ϱ� 
	public void print() {
		System.out.println("�����ȣ: " + no);
		System.out.println("��	  ��: " + name);
		System.out.println("���߾���: " + todo);
		System.out.println("�Ϸ�Ǽ�: " + completed);
		System.out.println("�� ô ��: " + completed/(double)todo);
		System.out.println();
	}

	public void develop() {
		System.out.println("��������");
		completed++;

	}
}