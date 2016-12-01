import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {
	
		int number = 123456789;

		String pattern = "#,###";
		DecimalFormat df = new DecimalFormat(pattern);
		String text = df.format(number);

		System.out.println(text);

		double rate = 2275956.308;
		// String pattern2 = "###,###,###.##";	// ��°�ڸ����� �ݿø��� ��� ��� 

		// String pattern2 = "#,###.####";			// ���ڸ��� ä���� �ʴ´�. 
		String pattern2 = "0,000.0000";				// 0�� ���ڸ��� ä���. 
		DecimalFormat df2 = new DecimalFormat(pattern2);
		String text2 = df2.format(rate);

		System.out.println(text2);
	}
}
// GregorianCalendar Ŭ���� �˾ƺ��� 
String���� �Ǿ��ִ� ��¥�� SimpleDateFormat�� �̿��ؼ� Date ��ü�� �ٲ۴�. 
