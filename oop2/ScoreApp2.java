public class ScoreApp2 {
	public static void main(String[] args) {
		
		// 객체 생성 및 홍길동 학생의 성적으로 객체가 초기화됨
		Score s = new Score();

		// 생성된 객체의 필드롤 초기화하는 과정을 생략할 수 있음

		// 바로 기능 사용 가능 

		int result1 = s.total();
		double result2 = s.avg();

		System.out.println("박재범님의 총점은: " + result1);
		System.out.println("박재범님의 평균은: " + result2);
	
	}
}