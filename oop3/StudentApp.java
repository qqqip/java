import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		// �л�����(��ȣ, �̸�, ����, ����, ���� ����) �Է¹޾Ƽ� 
		// Student ��ü�� �����ϱ� 
		
		Student student = new Student();
		
		System.out.print("��ȣ�� �Է��ϼ���: ");
		int value1 = s.nextInt();
		student.setNo(value1);

		System.out.print("�̸��� �Է��ϼ���: ");
		String value2 = s.next();
		student.setName(value2);
	
		System.out.print("���������� �Է��ϼ���: ");
		student.setKor(s.nextInt());

		System.out.print("���������� �Է��ϼ���: ");
		student.setEng(s.nextInt());

		System.out.print("���������� �Է��ϼ���: ");
		student.setMath(s.nextInt());

		System.out.println("�̸�: " + student.getName());
		System.out.println("����: " + student.getKor());
		System.out.println("����: " + student.getEng());
		System.out.println("����: " + student.getMath());
		System.out.println("����: " + student.getTotal());
		System.out.println("���: " + student.getAvgForRound());
		// ������ ���� �޼ҵ带 ȣ���� �� ����
	}
}