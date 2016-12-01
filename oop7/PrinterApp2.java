public class PrinterApp2 {
	public static void main(String[] args) {
		
		Printer p1 = new Printer();
		Printer p2 = new ColorPrinter();
		Printer p3 = new PhotoPrinter();

		

		/*
		아래의 수행문은 모두 print(String text)를 호출한다. 
		하지만, 실행결과는 각각 다르게 발현된다. 

		print(String text)를 실행했지만, 
		실제로 생성한 객체에 printer의 print(String text) 메소드를 재 정의한 메소드가 존재하면, 
		Printer의 print(String text) 메소드를 대신 재정의된 그 메소드가 실행한다. 

		따라서, print(String text) 라는 일관된 이름(사용법)으로 
		(심지어 그 객체를 참조하지 않고 있더라도)
		실제 생성된 객체의 재정의된 기능을 수행시킬 수 있다. 
		*/

		p1.print("공지 사항...");
		p2.print("매출 현황...");
		p3.print("여행 사진...");
	
	}
}