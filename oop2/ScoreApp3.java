public class ScoreApp3 {
	public static void main(String[] args) {
		
		Score s = new Score("�����",48,100,100);

		int result1 = s.total();
		System.out.println("����: " + result1);

		double result2 = s.avg();
		System.out.println("���: " + result2);

	}
}