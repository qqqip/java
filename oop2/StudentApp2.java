public class StudentApp2 {
	public static void main(String[] args) {
	
	// 학생들을 여러 명 저장하는 배열 만들기 
	// Student객체 3개 담을 수 있는 배열을 생성해서 students 변수에 담았다. 
	Student[] students = new Student[3];
	
	students[0] = new Student(1, "유시진", 100, 100, 100);
	students[1] = new Student(5, "박재범", 20, 30, 60);
	students[2] = new Student(8, "딩동댕", 88, 92, 11);

	/*
	students[0].info();
	students[1].info();
	students[2].info();

	for (int i=0; i<students.length; i++) {
		Student s = students [i];
		s.info();
	}
	*/
		
	System.out.println("이름 국어 영어 수학 총점 평균");
	for (Student s : students) {
		System.out.printf("%s %4d %4d %4d %4d %4d\n", s.name, s.kor, s.eng, s.math, s.total(), s.avg());
		//s.info();
		}
	}
}