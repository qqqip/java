public class Student {
	int no;	//�й�
	String name;
	int kor;
	int eng;
	int math;

	// �⺻������
	public Student() {
	} 
	
	// ��� �ʵ带 �ʱ�ȭ�ϴ� ������
	
	public Student(int n, String a, int x, int y, int z){
		no = n;
		name = a;
		kor = x;
		eng = y;
		math = z; 
	}

	// ������ ��ȯ�ϴ� ���
	public int total () {
		int value = kor + eng + math;
		return value;
	} 

	// ����� ��ȯ�ϴ� ���
	public int avg() {
		return total()/3;
	}
	
	// �л������� ����ϴ� ���(������ ��յ� ����)
	
	public void info() {
		System.out.println(no + "��" + name + "���� �����: " + kor);
		System.out.println(no + "��" + name + "���� �����: " + eng);
		System.out.println(no + "��" + name + "���� ���м���: " + math);
		System.out.println(no + "��" + name + "���� ����: " + total());
		System.out.println(no + "��" + name + "���� ���: " + avg());
	}





}