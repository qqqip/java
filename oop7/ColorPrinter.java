public class ColorPrinter extends Printer {
	
	int dpi;
	
	// 부모클래스 (printer)의 print() 메소드 재정의 
	public void print(String text) {
		System.out.println("["+text+"]를 컬러로 인쇄합니다.");
	}

	// ColorPrinter가 보유한 고유기능 
	public void chargeInk() {
		System.out.println("잉크를 충전합니다.");
	}

}