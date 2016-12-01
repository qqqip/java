// database access ����� ������ Ŭ���� 
public class DBAccess {

	// DBAccess ��ü�� �����ؼ� static ������ �����Ѵ�. 
	private static DBAccess db = new DBAccess();
	// �����ڸ� ����ȭ��Ų��. 
	private DBAccess() {}

	// ������ DBAccess ��ü�� ������ �� �ִ� �������� �������ִ�
	// ���� �޼ҵ带 �����Ѵ�. 
	public static DBAccess getInstance() {
		return db;
	}

	public void insert() {
		System.out.println("�߰� �۾�");		
	}

	public void update() {
		System.out.println("���� �۾�");
	}

	public void delete() {
		System.out.println("���� �۾�");
	}

	public void retrieve() {
		System.out.println("��ȸ �۾�");
	}

}