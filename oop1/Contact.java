public class Contact {
	// 속성 정의하기
	// 순번
		int no;
	// 이름 
		String name;
	// 연락처 
		String number;
	// 이메일 
		String email;


	// 기능 정의하기
	// 전화하기 
	public void call () {
		System.out.println(number + "(으)로 전화합니다.");
	}

	// 문자보내기 
	public void sendMessage() {
		System.out.println(name + "에게 문자를 보냅니다.");
	}
	// 메일보내기 
	public void sendMail() {
		System.out.println(email + "로 메일 보냅니다.");
	}
}