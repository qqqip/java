import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	
	public static void main(String[] args){
	
		Date now = new Date();

		//String pattern = "yyyy.M.d hh:mm:ss";
		//String pattern = "yy년 M월 d일 E요일";

		String pattern = "a hh시 m분 ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String text = sdf.format(now);	
		System.out.println(text);
	
	}
}