public class ScoreApp1 {
	public static void main(String[] args) {
		// 디폴트생성자
		Score s = new Score();

		s.name = "재범";
		s.kor = 24;
		s.eng = 100;
		s.math = 99;
		
		int result1 = s.total();
		double result2 = s.avg();

		System.out.println("박재범님의 총점은: " +result1);
		System.out.println("박재범님의 평균은: " + result2);
	
	}
}