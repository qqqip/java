public class SmartPhone extends Phone {
	
	String ip;
	String email;

	/*
	// �θ�Ŭ�����κ��� �������� �ʵ�
	String telNumber;

	//�θ�Ŭ�����κ��� �������� �޼ҵ� 
	public void call(String to) {
		System.out.println("["+telNumber+"]���� ["+to+"]�� ��ȭ�� �̴ϴ�.");
	}

	public void message(String to, String text) {
		System.out.println("["+telNumber+"]���� ["+to+"]�� ["+text+"]�� �����ϴ�.");
	*/

	public void web(String url) {
		System.out.println("["+url+"] �� �������� ǥ���մϴ�.");
	}

	public void sendEmail(String to, String title, String text) {
		System.out.println("["+email+"]���� ["+to+"]��  ["+title+"] ["+text+"]�� �����ϴ�.");
	}
}