public class MethodDemo1 {
		
		// �޼ҵ� ����(����)
		public static void a() {
			System.out.println("����ڰ� ������ a �޼ҵ��Դϴ�.");
		}

		// �Ű������� ������ �ִ� �żҵ� ����
		// �Ű������� �޼ҵ� ���༼ �ʿ��� ���� ���޹޾Ƽ� ��´�. 
		public static void b(int x) {
			System.out.println("b�޼ҵ尡 ����Ǿ����ϴ�.");
			System.out.println("b�޼ҵ� ����� ���޹��� ��: " + x);
		
		}

		public static void c(String str) {
			System.out.println("c�޼ҵ尡 ����Ǿ����ϴ�.");
			System.out.println("c�޼ҵ尡 ����� ���޹��� ��:" + str);
		}

		public static void d(int x, int y) {
			System.out.println("d�޼ҵ尡 ����Ǿ����ϴ�.");
			System.out.println("d�޼ҵ尡 ����� ���޹��� ��:" + x + "," + y);
		}

		public static void e(String name, String email, int age) {
			System.out.println("e�޼ҵ尡 ����Ǿ����ϴ�.");
			System.out.println("e�޼ҵ尡 ����� ���޹��� ��:" + name );
			System.out.println("e�޼ҵ尡 ����� ���޹��� ��:" + email );
			System.out.println("e�޼ҵ尡 ����� ���޹��� ��:" + age);
		}


		
		// �޼ҵ带 ȣ��(����)
		public static void main(String[] args) {
			a();
			
			b(100);	// �Ű������� �ִ� �żҵ� ȣ��
			int k = 20;
			b(k);		//b();�� ������ ����. �����ϱ� ���ؼ��� �ݵ�� ������ �ϳ��� ���޵Ǿ�� �Ѵ�. 
			
			c("ȫ�浿");
			c("�ȳ�," + "���� ȫ�浿�̶�� �մϴ�.");

			d(100,20);
			int i = 10;
			int j = 20;
			d(i,j);

			e("�����", "����@gmail.com", j);
		



		}
	}
