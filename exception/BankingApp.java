public class BankingApp {
	public static void main(String[] args) {
		
		Banking banking = new Banking("박재범", "11-111", "1234", 1000000, false);
		
		try {
			banking.changePassword("1111", "2580");

			int money = banking.withdraw("2222", 20000000);
		} catch (BankingException e) {
			String errorMessage = e.getMessage();
			String errorCode = e.getErrorCode();
			System.out.println("오류 정보: ["+errorCode+"]" + errorMessage);
		}
	}
}
