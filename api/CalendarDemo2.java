import java.util.*;

public class CalendarDemo2 {
	public static void main(String[] args) {
		
		// Date --> Calendar
		Date date = new Date();
		// �� ��¥�� �ش��ϴ� �и������尪�� ��ȯ�Ѵ�. 
		long time = date.getTime();
		

		Calendar cal = Calendar.getInstance();
		// �и������尪�� �ش��ϴ� Calendar�� ����ȴ�. 
		cal.setTimeInMillis(time);		// cal.setTime(date);
		

		// Calendar --> Date\
		// Calendar ��ü�� ��¥�� �ش��ϴ� Date ��ü�� ��ȯ�ȴ�. 
		Date date2 = cal.getTime();
	
	}
}