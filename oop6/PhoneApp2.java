public class PhoneApp2 {
	public static void main(String[] args) {
		
		
		SmartPhone	 p1 = new SmartPhone();
		FeaturePhone p2 = new FeaturePhone();
		// p1 ���������� SmartPhone�� �����ϰ� �ֱ� ������ 
		// SmartPhone ��ü�� �ʵ�� �Ӽ��� ���� �����ϰ�,
		// Phone ��ü�� �ʵ�� �Ӽ��� ���� �����ϴ�. 
		p1.ip = "192.168.0.1";				// SmartPhone�� ���ǵ� �ʵ�
		p1.web("www.naver.com");			// SmartPhone�� ���ǵ� �޼ҵ�
		p1.telNumber = "010-123-4567";	// Phone�� ���ǵ� �ʵ�
		p1.call("010-111-1111");							// Phone�� ���ǵ� �޼ҵ� 

		
		// Smartphone�� FeaturePhone �� Phone Ÿ���� ���������� ���
		// ��Ӱ��迡 �ִ� Ŭ������ ��� �θ�Ÿ���� ���������� �ڽ�Ŭ���� Ÿ���� ��ü�� ������ �� �ִ�. 
		Phone		 p3 = new SmartPhone();
		Phone		 p4 = new FeaturePhone();
		
		p3.web("www.daum.net");
		p3.telNumber = "010-1234-5678";
		p3.call("010-2222-2222");
		System.out.println(p2);
		System.out.println(p3);

	}
}