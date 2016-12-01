import java.util.Date;
import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
	
			Calendar now = Calendar. getInstance();
			//System.out.println(now);
			long nowTime = now.getTimeInMillis();

			int year = now.get(Calendar.YEAR);	// �����ε� ������������ 
			int month = now.get(Calendar.MONTH) + 1;
			int day = now.get(Calendar.DAY_OF_MONTH);
			//System.out.printf("%d�� %d�� %d��\n", year, month, day);

			Calendar birth = Calendar.getInstance();
			birth.set(1991, 5, 7);
			long birthTime = birth.getTimeInMillis();
			//	System.out.println(birth);

			long lifeTime = (nowTime - birthTime)/1000;
			System.out.println("��: " + lifeTime);
			System.out.println("��: " + lifeTime/60);
			System.out.println("�ð�: " + lifeTime/(60*60));
			System.out.println("��: " + lifeTime/(60*60*24));
			System.out.println("��: " + (double)lifeTime/(60*60*24*365));

			Date date = birth.getTime();
			System.out.println(date);
	}
}