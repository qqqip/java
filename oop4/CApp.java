public class CApp {
	public static void main(String[] args) throws Exception {
		// Class.forName("전체클래스이름");
		// 해당 클래스를 찾아서 메모리에 로딩한다.
		//Class.forName("C");	// ---> 초기화 블록이 실행됐다. 

		//C c1 = new C();
		//C c2 = new C();
		//C c3 = new C();
		
		System.out.println(C.y);
		System.out.println(C.y);
		System.out.println(C.y);

	}
}