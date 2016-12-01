public class MemberService {
	
	// 고객정보
	private Member member;

	/*
	// 생성자
	public MemberService(Member member) {
		this.member = member;
	}
	
	// 아이디와 비번을 전달받아서 로그인가능 여부를 반환하는 메소드
	public boolean login(String id, String password) {
		boolean result = false;
			if (id == member.getId() && password == member.getPassword()) {
				result = true;
		}  
		return result;
	}

	// 아이디를 전달받아서 로그아웃기능을 수행하는 메소드
	public void logout(String id) {
		System.out.println("["+id+"]님이 로그아웃 되었습니다.");
	}
	*/

	private boolean auth;

	public MemberService(Member member) {
		this.member = member;
	}
	public boolean isAuth() {
		return auth;
	}
	// 아이디와 비번을 전달받아서 member에 저장된 아이디 비밀번호와 비교해서
	// 아이디, 비밀번호가 일치하면 auth값을 true로 변경하기
	public void login(String id, String password) {
		if (member.getId().equals(id) && member.getPassword().equals(password)) {
			auth = true;
		} 		
	}


	// 아이디를 전달받아서 로그아웃 처리하기(auth값을 false로 바꾸기)
	public void logout() {
		if (auth) {
			auth = false;
		}
	}
}