public class B {
	int x;
	static int y;

	public void m1() {
		System.out.println(x);
		System.out.println(y);
	}

	// static �޼ҵ忡���� non-static ������ ����� �� ����.  
	// this�� ����� �� ����. 
	public static void m2() {
		//System.out.println(x);	// ��ü�� ��������� ������ �� �ֱ� ������ ������ ����
		System.out.println(y);
	}

	public void m3() {
		m1();
		m2();
	
	}
	// static �޼ҵ忡���� non-static ������ ����� �� ����.  
	public static void m4() {
		//m1();	// ������ ����
		m2();
	}


}