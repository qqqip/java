public class Quizz2 {
	public static void main(String[] args) {
		String text = "<qqqip@naver.com>,<soom@gmail.com>,<heehee@daum.net>,<nini@hanmail.net>";
		String[] emails = text.split(",");

		for (String mail : emails) {
			String id = mail.substring(1, mail.length()-1);
			System.out.println(id);
		}

		/*
		for (String mail : emails) {
			int beginIndex = mail.indexOf("<");
			int endIndex = mail.indexOf(">");

			mail = mail.substring(beginIndex+1, endIndex);
			System.out.println(mail);
		}

		or

		for (String mail : emails) {
			mail = mail.replace("<", "").replace(">","");
			System.out.println(mail);
		}
		
		*/
	}
}