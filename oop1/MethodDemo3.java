import java.util.Random;
import java.util.Date;


public class MethodDemo3 {

	// ������ �߻���Ű�� �޼ҵ� �����
	
	public static int random () {
		Random r = new Random();
		int number = r.nextInt(100);

		// return Ű����� �� �޼ҵ带 ȣ���� ���� ���� ��ȯ�Ѵ�.
		return number; 
	} 

	// ���� ��¥�� ��ȯ�ϴ� �޼ҵ� ����� 
		public static String getCurrentDate() {
			Date now = new Date();
			String str = now.toString();

			return str;
		
		}

	public static void main(String[] args) {
		int x = random();
		System.out.println(x);
		
		System.out.println(random());
		System.out.println(random() *100);
		// System.out.println(a() * 100); �� ���� �ȵ�. voidŸ���̶�

		int y = random() * 1000;
		System.out.println(y);

		String d = getCurrentDate();
		System.out.println(d);


	}
}
