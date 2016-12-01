public class CarApp { //app는 메인이 있는거
	public static void main(String[] args) {
		
		/*
		new Car();	//객체만듬. 
		Car c = new Car();	//변수를 만들어서 담음. Car라는 설계도를 사용해서 생성된 객체의 주소값을 담는 변수 c를 만든ㄷㅏ.
		*/

		Car c = new Car();	// Car타입의 변수 c. Car타입 = 클래스타입,참조타입. c = 참조변수
		System.out.println(c); //해시코드값15db9742가 출력

		Car c2 = new Car();
		System.out.println(c2);


		// 생성된 객체의 필드, 생성된 객체의 메소드를 사용하기
		System.out.println(c.speed);
		c.speed = 10;
		System.out.println(c.speed);

		c.speedUp();
		System.out.println(c.speed);


	}
}