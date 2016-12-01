import java.io.*;

public class StudentApp1 {
	public static void main(String[] args) throws Exception {
		/*
		score.txt ������ �о ���������� �о ȭ�鿡 ����ϴ� ���α׷�
		1. �л������� ��� Student Ŭ���� �����ϱ� 
		2. StudentApp �����ϱ� 
			- FileReader �� BufferedReader�� ����ؼ� ���� ������ �о���� 
			- �о�� ������ , �������� �ڸ��� 
			- �߶� ������ Student ��ü�� �����ؼ� �����ϱ� 
				(������ ���ڷ� ��ȯ�ϱ�: int Integer.parseInt(����))
			- Student ��ü�� ����� ������ ȭ�鿡 ǥ���ϱ�
			*/

		BufferedReader reader = new BufferedReader(new FileReader("score.txt"));
		String text = reader.readLine();
		String[] stu = text.split(",");

		Student st1 = new Student();	// ��ü ���� 
		
		int kor = Integer.parseInt(stu[2]);
		int math = Integer.parseInt(stu[3]);
		int eng = Integer.parseInt(stu[4]);
		

		st1.setName(stu[0]);
		st1.setGrade(stu[1]);
		st1.setKor(kor);
		st1.setMath(math);
		st1.setEng(eng);
	
		System.out.println("�̸�: " + st1.getName());
		System.out.println("�г�: " + st1.getGrade());
		System.out.println("��������: " + st1.getKor());
		System.out.println("��������: " + st1.getMath());
		System.out.println("��������: " + st1.getEng());










	}
}