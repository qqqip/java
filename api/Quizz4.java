import java.util.Scanner;
import java.util.regex.Pattern;

public class Quizz4 {
	public static void main(String[] args) {
		// ���̵� �Է¹޾Ƽ� �ùٸ� ���̵����� �˻��ϱ�
		// ���̵� �ۼ� ��Ģ(���̰� 6���� �̻�, ����ҹ���)
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է��ϼ���: ");
		String userId = sc.next();

		// �˻��ϱ�
		// ���̵� 6���� �̻����� �˻��ϱ�
		if (userId.length() < 6) {
			System.out.println("���̵� 6���� �̻� �Է��ϼ���: ");
			return;
		}
		
		check 1 = 
		// ���̵� ���� �ҹ��ڷθ� �����Ǿ����� �˻��ϱ� <-- boolean
		boolean invalid = false;	// <-- Flag ����  : ���� ������ Ư�� ���¸� �����ϴ� ���� 
		for(int i=0; i<userId.length(); i++) {
			int value = (int) userId.charAt(i);
			if (value <97 || value >122 ) {
				invalid = true;
				break;
			}
		} // ���� Ʋ�� �κ�

		if (invalid) {
			System.out.println("���̵� �ҹ��ڷ� �Է��ϼ���: ");
		}
	}
} 

/*
Ư���� ������ �������� üũ 
boolean valid = false;
String regExp = "^[a-z]{6,}$";	//^����	$��
valid = Pattern.matches(regExp, userId);

if (!valid) {
	System.out.println(��ȿ���� ����");
}

*/