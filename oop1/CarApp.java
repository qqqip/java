public class CarApp { //app�� ������ �ִ°�
	public static void main(String[] args) {
		
		/*
		new Car();	//��ü����. 
		Car c = new Car();	//������ ���� ����. Car��� ���赵�� ����ؼ� ������ ��ü�� �ּҰ��� ��� ���� c�� ���礧��.
		*/

		Car c = new Car();	// CarŸ���� ���� c. CarŸ�� = Ŭ����Ÿ��,����Ÿ��. c = ��������
		System.out.println(c); //�ؽ��ڵ尪15db9742�� ���

		Car c2 = new Car();
		System.out.println(c2);


		// ������ ��ü�� �ʵ�, ������ ��ü�� �޼ҵ带 ����ϱ�
		System.out.println(c.speed);
		c.speed = 10;
		System.out.println(c.speed);

		c.speedUp();
		System.out.println(c.speed);


	}
}