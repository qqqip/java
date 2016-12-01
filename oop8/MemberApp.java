public class MemberApp {
	public static void main(String[] args) {
		// 회원정보를 담기 위한 Member 객체를 생성하고
		// setter 를 사용해서 이름, 아이디, 비번, 나이 등의 데이터를 객체에 저장하기

		Member a = new Member();

		a.setName("박재범");
		a.setId("qq");
		a.setPassword("12345");
		a.setAge(25);
		
		// 생성된 Member 객체에 저장된 값을 getter 함수를 사용해서 화면에 출력하기
		System.out.println("♥" + a.getName() + "♥");
		System.out.println(a.getId());
		System.out.println(a.getPassword());
		System.out.println(a.getAge());

	}
}