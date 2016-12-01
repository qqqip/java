import java.util.Scanner;

public class Quizz1 {

	public static void main(String[] args) {
		// 이메일을 입력받아서 이메일에 포함된 아이디부분만 출력하기
		//  예> eungsulee@hanmail.net ---> eunsulee
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일을 입력하세요: ");
		String email = sc.next();
		String [] result1 = email.split("@");
		System.out.println(result1[0]);

		/*
		int index = email.indexOf("@");
		String id = email.substring(0, index);
		System.out.println("아이디: " + id);
		
		String[] arr = email.split("@");
		System.out.println("아이디: " + arr[0]);
		*/

	}
}