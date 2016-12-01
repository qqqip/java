public class Phone {

	String telNumber;

	public void call(String to) {
		System.out.println("["+telNumber+"]에서 ["+to+"]로 전화를 겁니다.");
	}

	public void message(String to, String text) {
		System.out.println("["+telNumber+"]에서 ["+to+"]로 ["+text+"]를 보냅니다.");
	}
} 