public abstract class Transaction {
	
	//������ �ʴ� �۾�
	public void connect() {
		System.out.println("���� ����� ����");
	}

	// ������ �ʴ� �۾�
	public void close() {
		System.out.println("���� ����� ���� ����");
	}
	// ���ϴ� �۾�
	public abstract void job();

	public void process() {
		connect();
		job();
		close();
	}
}