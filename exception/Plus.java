public class Plus {

	public static void main(String[] args) {
	
		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);

			int sum = number1 + number2;
			System.out.println("합계: " + sum);
		} catch (NumberFormatException e) {
			System.out.println("사용법: java Plus <숫자> <숫자>");
		}
		
	}	
}