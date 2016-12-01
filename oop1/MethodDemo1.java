public class MethodDemo1 {
		
		// 메소드 정의(구현)
		public static void a() {
			System.out.println("사용자가 정의한 a 메소드입니다.");
		}

		// 매개변수를 가지고 있는 매소드 정의
		// 매개변수는 메소드 실행세 필요한 값을 전달받아서 담는다. 
		public static void b(int x) {
			System.out.println("b메소드가 실행되었습니다.");
			System.out.println("b메소드 실행시 전달받은 값: " + x);
		
		}

		public static void c(String str) {
			System.out.println("c메소드가 실행되었습니다.");
			System.out.println("c메소드가 실행시 전달받은 값:" + str);
		}

		public static void d(int x, int y) {
			System.out.println("d메소드가 실행되었습니다.");
			System.out.println("d메소드가 실행시 전달받은 값:" + x + "," + y);
		}

		public static void e(String name, String email, int age) {
			System.out.println("e메소드가 실행되었습니다.");
			System.out.println("e메소드가 실행시 전달받은 값:" + name );
			System.out.println("e메소드가 실행시 전달받은 값:" + email );
			System.out.println("e메소드가 실행시 전달받은 값:" + age);
		}


		
		// 메소드를 호출(실행)
		public static void main(String[] args) {
			a();
			
			b(100);	// 매개변수가 있는 매소드 호출
			int k = 20;
			b(k);		//b();는 컴파일 오류. 실행하기 위해서는 반드시 정수값 하나가 전달되어야 한다. 
			
			c("홍길동");
			c("안녕," + "저는 홍길동이라고 합니다.");

			d(100,20);
			int i = 10;
			int j = 20;
			d(i,j);

			e("박재범", "우우우@gmail.com", j);
		



		}
	}
