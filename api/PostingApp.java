import java.util.Date;

public class PostingApp {
	public static void main(String[] args) {
		
		Posting p = new Posting(1, "�̺�Ʈ", "ũ�������� ���� �̺�Ʈ", new Date());

		System.out.println("�۹�ȣ: " + p.getNo());
		System.out.println("��  ��: " + p.getTitle());
		System.out.println("�ۼ���: " + p.getPrettyRegdate());


		/*
		Date d1 = p.getRegdate();
		System.out.println(d1);

		String d2 = p.getPrettyRegdate();
		System.out.println(d2);
		*/


	}
}