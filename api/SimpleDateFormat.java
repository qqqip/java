import java.text.SimpleDateFormat;

public class DateFormatDemo {
	
	public static void main(String[] args){
	
		Date now = new Date();

		String pattern = "yyyy.nn.dd	";

		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String text = sdf.format(now);	
		System.out.println(text);
	
	}
}