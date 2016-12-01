public class FinalDemo2 {
	
	// 생성된 객체마다 다른값을 가질 수는 있지만,
	// 한 번 값이 할당된 이후에는 값을 변경할 수 없다. 

	private final int x;
	private int y;

	public FinalDemo2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}

	// final로 지정된 변수는 setter를 사용해서 값을 변경할 수 없다. 
	/*
	public void setX(int x) {
		this.x = x;
	}
	*/

	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	
	}

}