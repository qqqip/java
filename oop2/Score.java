public class Score {
	String name;
	int kor;
	int eng;
	int math;

	// 기본생성자
	public Score() {
		// 필드 초기화 
		name = "재범";
		kor = 24;
		eng = 100;
		math = 99;
	}

	public Score(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		math = m;
	
	}


	public int total() {
		return kor + eng + math;

	}
	public double avg() {
		return total()/3.0;
	}
}