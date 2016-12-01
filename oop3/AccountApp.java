public class AccountApp {
	public static void main(String[] args) {
		Account a = new Account("soominsong", "1005-341-334679", 3290, 100000);

		// System.out.println("예금주: " + a.owner); // 신기방기 실행안됨
		
		System.out.println("예금주: " + a.getOwner()); // getOwner함수 실행
		
		a.info();
		
	}
}