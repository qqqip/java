public class StudentApp2 {
	public static void main(String[] args) {
	
	// �л����� ���� �� �����ϴ� �迭 ����� 
	// Student��ü 3�� ���� �� �ִ� �迭�� �����ؼ� students ������ ��Ҵ�. 
	Student[] students = new Student[3];
	
	students[0] = new Student(1, "������", 100, 100, 100);
	students[1] = new Student(5, "�����", 20, 30, 60);
	students[2] = new Student(8, "������", 88, 92, 11);

	/*
	students[0].info();
	students[1].info();
	students[2].info();

	for (int i=0; i<students.length; i++) {
		Student s = students [i];
		s.info();
	}
	*/
		
	System.out.println("�̸� ���� ���� ���� ���� ���");
	for (Student s : students) {
		System.out.printf("%s %4d %4d %4d %4d %4d\n", s.name, s.kor, s.eng, s.math, s.total(), s.avg());
		//s.info();
		}
	}
}