// �߻� Ŭ����
public abstract class DBAccess {
	
	// �����޼ҵ�
	public void connect() {
		System.out.println("db�� �����մϴ�.");
	}
	
	// �߻�ȭ�޼ҵ�
	public abstract void createRepository();

	// �����޼ҵ�
	public void disconnect() {
		System.out.println("db�� ������ �����մϴ�.");
	}
}