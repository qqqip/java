import java.util.Scanner;

public class Quizz1 {

	public static void main(String[] args) {
		// �̸����� �Է¹޾Ƽ� �̸��Ͽ� ���Ե� ���̵�κи� ����ϱ�
		//  ��> eungsulee@hanmail.net ---> eunsulee
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸����� �Է��ϼ���: ");
		String email = sc.next();
		String [] result1 = email.split("@");
		System.out.println(result1[0]);

		/*
		int index = email.indexOf("@");
		String id = email.substring(0, index);
		System.out.println("���̵�: " + id);
		
		String[] arr = email.split("@");
		System.out.println("���̵�: " + arr[0]);
		*/

	}
}