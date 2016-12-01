import java.util.*;

public class CalendarDemo2 {
	public static void main(String[] args) {
		
		// Date --> Calendar
		Date date = new Date();
		// 그 날짜에 해당하는 밀리세컨드값을 반환한다. 
		long time = date.getTime();
		

		Calendar cal = Calendar.getInstance();
		// 밀리세컨드값에 해당하는 Calendar로 변경된다. 
		cal.setTimeInMillis(time);		// cal.setTime(date);
		

		// Calendar --> Date\
		// Calendar 객체의 날짜에 해당하는 Date 객체가 반환된다. 
		Date date2 = cal.getTime();
	
	}
}