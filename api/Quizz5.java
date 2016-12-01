public class Quizz5 {
	public static void main(String[] agrs) {
	
		String[] words = {"새끼","놈","년","병신"};

		String text = "바보놈";

		// 위에서 나열한 금칙어가 포함되어 있는지 여부 확인하기
		boolean isContains = false;
		
		for (String word : words) {
			boolean value = text.contains(word);
			if (value) {
				isContains = true;
				System.out.println("게시할 수 없습니다.");
			}
		}
	}
}