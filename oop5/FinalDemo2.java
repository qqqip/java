public class FinalDemo2 {
	
	// ������ ��ü���� �ٸ����� ���� ���� ������,
	// �� �� ���� �Ҵ�� ���Ŀ��� ���� ������ �� ����. 

	private final int x;
	private int y;

	public FinalDemo2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}

	// final�� ������ ������ setter�� ����ؼ� ���� ������ �� ����. 
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