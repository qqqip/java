public class FinalDemo2App {
	public static void main(String[] args) {
		
		/*
		FinalDemo2 객체는 객체마다 x값과 y값을 각각 다른 값을 가진 객체로 생성할 수 있다. 
		하지만, final로 지정된 x값은 변경할 수 없다. 
		*/
		FinalDemo2 d1 = new FinalDemo2(10, 1);
		d1.setY(9);
		FinalDemo2 d2 = new FinalDemo2(20, 3);
		d2.setY(5);
	}
}