public class MemberServiceApp {
	
	public static void main(String[] args) {
		/*
			�̸�: "�����"
			���̵�: park
			��й�ȣ: "1234"
			����: 30
			������ ���� Member ��ü�� ��� �ִ� MemberService ��ü �����ϱ� 
		*/
		
		Member member = new Member();
		member.setName("�����");
		member.setId("park");
		member.setPassword("1234");
		member.setAge(30);
		
		MemberService service = new MemberService(member);

		// MemberService �� ���ǵ� login ��� ����غ��� 
		//System.out.println(service.login("hong","1234"));
		
		service.login("park","1234");
		System.out.println(service.isAuth());

		service.logout();
		System.out.println(service.isAuth());
	}
}