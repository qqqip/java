public class C {
	
	int x;
	static int y;

	// 정적 초기화 블록
	// 정적 변수의 초기화 작업에 필요한 수행문을 적는다. 
	// 주로 프로그램 실행에 사용되는 외부 리소스 연결 작업을 구현한다. 
	static {
		System.out.println("초기화 블록이 실행됨");
		// 정적변수, 정적 메소드를 사용할 수 있다. 
	}

	public C() {
		System.out.println("생성자 실행됨");
	}
}