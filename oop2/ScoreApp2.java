public class ScoreApp2 {
	public static void main(String[] args) {
		
		// ��ü ���� �� ȫ�浿 �л��� �������� ��ü�� �ʱ�ȭ��
		Score s = new Score();

		// ������ ��ü�� �ʵ�� �ʱ�ȭ�ϴ� ������ ������ �� ����

		// �ٷ� ��� ��� ���� 

		int result1 = s.total();
		double result2 = s.avg();

		System.out.println("��������� ������: " + result1);
		System.out.println("��������� �����: " + result2);
	
	}
}