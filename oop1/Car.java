public class Car {
	// �Ӽ�(�ʵ�) �����ϱ�
	int speed; 
	
	// ���(�޼ҵ�) �����ϱ� 
	public void speedUp() {
		speed += 10;
		System.out.println("���� �ӵ�:" + speed + "km");
	}

	public void speedDown() {
		speed -= 10;
		System.out.println("����ӵ�: " + speed + "km");

	}
}