public class Student {
	int no;	//학번
	String name;
	int kor;
	int eng;
	int math;

	// 기본생성자
	public Student() {
	} 
	
	// 모든 필드를 초기화하는 생성자
	
	public Student(int n, String a, int x, int y, int z){
		no = n;
		name = a;
		kor = x;
		eng = y;
		math = z; 
	}

	// 총점을 변환하는 기능
	public int total () {
		int value = kor + eng + math;
		return value;
	} 

	// 평균을 반환하는 기능
	public int avg() {
		return total()/3;
	}
	
	// 학생정보를 출력하는 기능(총점과 평균도 포함)
	
	public void info() {
		System.out.println(no + "♥" + name + "님의 국어성적: " + kor);
		System.out.println(no + "♥" + name + "님의 영어성적: " + eng);
		System.out.println(no + "♥" + name + "님의 수학성적: " + math);
		System.out.println(no + "♥" + name + "님의 총점: " + total());
		System.out.println(no + "♥" + name + "님의 평균: " + avg());
	}





}