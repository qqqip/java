public class Fileupload {
	
	long maxFileSize;
	int maxFileAmount;

	public Fileupload() {
		maxFileSize = 1024*1024*10; //10M
		maxFileAmount = 10;
	}
	public Fileupload(long size) {
		maxFileSize = size;
		maxFileAmount = 10;
	
	}
	public Fileupload(int amount) {
		maxFileSize = 1024*1024*10; //10M
		maxFileAmount = amount;
	
	}
	public Fileupload(long size, int amount) {
		maxFileSize = size;
		maxFileAmount = amount;
	
	}
	public void upload() {
		System.out.println("���� ���ε���.........");
		System.out.println("�ִ� ���� ������: "+ maxFileSize);
		System.out.println("�ִ� ���� ����: " + maxFileAmount);
	}
}