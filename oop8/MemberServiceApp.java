public class MemberServiceApp {
	
	public static void main(String[] args) {
		/*
			이름: "박재범"
			아이디: park
			비밀번호: "1234"
			나이: 30
			정보를 가진 Member 객체를 담고 있는 MemberService 객체 생성하기 
		*/
		
		Member member = new Member();
		member.setName("박재범");
		member.setId("park");
		member.setPassword("1234");
		member.setAge(30);
		
		MemberService service = new MemberService(member);

		// MemberService 에 정의된 login 기능 사용해보기 
		//System.out.println(service.login("hong","1234"));
		
		service.login("park","1234");
		System.out.println(service.isAuth());

		service.logout();
		System.out.println(service.isAuth());
	}
}