public class ScoreApp1 {
	public static void main(String[] args) {
		// ����Ʈ������
		Score s = new Score();

		s.name = "���";
		s.kor = 24;
		s.eng = 100;
		s.math = 99;
		
		int result1 = s.total();
		double result2 = s.avg();

		System.out.println("��������� ������: " +result1);
		System.out.println("��������� �����: " + result2);
	
	}
}