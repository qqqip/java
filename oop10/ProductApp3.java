import java.util.Arrays;

public class ProductApp3 {
	public static void main(String[] args) {
		Product[] cart = new Product[5];
		cart[0] = new Product("����", 3000);
		cart[1] = new Product("����", 16000);
		cart[2] = new Product("����", 1000);
		cart[3] = new Product("����", 25000);
		cart[4] = new Product("���찳", 500);

		System.out.println(Arrays.toString(cart));	//Arrays �ȿ��ִ� toString = displayinfo �� ����� ���� // �迭�� ������ ������
	
	}
}