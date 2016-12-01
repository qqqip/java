public class SmartPhone extends Phone {
	
	String ip;
	String email;

	/*
	// 부모클래스로부터 물려받은 필드
	String telNumber;

	//부모클래스로부터 물려받은 메소드 
	public void call(String to) {
		System.out.println("["+telNumber+"]에서 ["+to+"]로 전화를 겁니다.");
	}

	public void message(String to, String text) {
		System.out.println("["+telNumber+"]에서 ["+to+"]로 ["+text+"]를 보냅니다.");
	*/

	public void web(String url) {
		System.out.println("["+url+"] 웹 페이지를 표시합니다.");
	}

	public void sendEmail(String to, String title, String text) {
		System.out.println("["+email+"]에서 ["+to+"]로  ["+title+"] ["+text+"]를 보냅니다.");
	}
}