public class App {
	public static void main(String[] args) {
		
		// static 변수는 객체 생성없이 
		// (클래스명.변수명)으로 사용가능 
		System.out.println(A.y);
		
		// 정적변수 y에 값 할당하기
		// A클래스를 사용해서 만든 모든 객체는 
		// 정적변수 y값을 공유한다.

		A.y = 100;

		// 멤버변수 x는 생성된 객체마다 개별적으로 생성된다.
		// 각각의 객체는 객체마다 다른 x 값을 가질 수 있다. 

		A a1 = new A();
		//a1.x = 10;
		System.out.println("x: " + a1.x);
		// System.out.println(a1.y);	// 출력되지만, y값을 멤버변수로 오해할 수 있다.
		System.out.println("y: " + A.y);
		
		A a2 = new A();
		//a2.x = 20;
		System.out.println("x: " + a2.x);
		System.out.println("y: " + A.y);
		
		A a3 = new A();
		//a3.x = 30;
		System.out.println("x: " + a3.x);
		System.out.println("y: " + a3.y);

	}
}