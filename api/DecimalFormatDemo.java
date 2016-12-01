import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {
	
		int number = 123456789;

		String pattern = "#,###";
		DecimalFormat df = new DecimalFormat(pattern);
		String text = df.format(number);

		System.out.println(text);

		double rate = 2275956.308;
		// String pattern2 = "###,###,###.##";	// 셋째자리에서 반올림한 결과 출력 

		// String pattern2 = "#,###.####";			// 빈자리를 채우지 않는다. 
		String pattern2 = "0,000.0000";				// 0은 빈자리를 채운다. 
		DecimalFormat df2 = new DecimalFormat(pattern2);
		String text2 = df2.format(rate);

		System.out.println(text2);
	}
}
// GregorianCalendar 클래스 알아보기 
String으로 되어있는 날짜를 SimpleDateFormat을 이용해서 Date 객체로 바꾼다. 
