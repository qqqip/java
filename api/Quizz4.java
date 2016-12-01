import java.util.Scanner;
import java.util.regex.Pattern;

public class Quizz4 {
	public static void main(String[] args) {
		// 아이디를 입력받아서 올바른 아이디인지 검사하기
		// 아이디 작성 규칙(길이가 6글자 이상, 영어소문자)
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요: ");
		String userId = sc.next();

		// 검사하기
		// 아이디가 6글자 이상인지 검사하기
		if (userId.length() < 6) {
			System.out.println("아이디를 6글자 이상 입력하세요: ");
			return;
		}
		
		check 1 = 
		// 아이디가 영어 소문자로만 구성되었는지 검사하기 <-- boolean
		boolean invalid = false;	// <-- Flag 변수  : 로직 수행의 특정 상태를 저장하는 변수 
		for(int i=0; i<userId.length(); i++) {
			int value = (int) userId.charAt(i);
			if (value <97 || value >122 ) {
				invalid = true;
				break;
			}
		} // 내가 틀린 부분

		if (invalid) {
			System.out.println("아이디를 소문자로 입력하세요: ");
		}
	}
} 

/*
특별한 패턴을 가졌는지 체크 
boolean valid = false;
String regExp = "^[a-z]{6,}$";	//^시작	$끝
valid = Pattern.matches(regExp, userId);

if (!valid) {
	System.out.println(유효하지 않음");
}

*/