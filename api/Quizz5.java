public class Quizz5 {
	public static void main(String[] agrs) {
	
		String[] words = {"����","��","��","����"};

		String text = "�ٺ���";

		// ������ ������ ��Ģ� ���ԵǾ� �ִ��� ���� Ȯ���ϱ�
		boolean isContains = false;
		
		for (String word : words) {
			boolean value = text.contains(word);
			if (value) {
				isContains = true;
				System.out.println("�Խ��� �� �����ϴ�.");
			}
		}
	}
}