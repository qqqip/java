public class MemberService {
	
	// ������
	private Member member;

	/*
	// ������
	public MemberService(Member member) {
		this.member = member;
	}
	
	// ���̵�� ����� ���޹޾Ƽ� �α��ΰ��� ���θ� ��ȯ�ϴ� �޼ҵ�
	public boolean login(String id, String password) {
		boolean result = false;
			if (id == member.getId() && password == member.getPassword()) {
				result = true;
		}  
		return result;
	}

	// ���̵� ���޹޾Ƽ� �α׾ƿ������ �����ϴ� �޼ҵ�
	public void logout(String id) {
		System.out.println("["+id+"]���� �α׾ƿ� �Ǿ����ϴ�.");
	}
	*/

	private boolean auth;

	public MemberService(Member member) {
		this.member = member;
	}
	public boolean isAuth() {
		return auth;
	}
	// ���̵�� ����� ���޹޾Ƽ� member�� ����� ���̵� ��й�ȣ�� ���ؼ�
	// ���̵�, ��й�ȣ�� ��ġ�ϸ� auth���� true�� �����ϱ�
	public void login(String id, String password) {
		if (member.getId().equals(id) && member.getPassword().equals(password)) {
			auth = true;
		} 		
	}


	// ���̵� ���޹޾Ƽ� �α׾ƿ� ó���ϱ�(auth���� false�� �ٲٱ�)
	public void logout() {
		if (auth) {
			auth = false;
		}
	}
}