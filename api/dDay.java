import java.util.*;
import java.util.Scanner;

public class dDay {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��¥�� �Է��ϼ���: (��: 2016-11-01) ");
		String date = sc.next();
		String[] fday = date.split("-");
				
		int year = Integer.parseInt(fday[0]);
		int month = Integer.parseInt(fday[1]);
		int day = Integer.parseInt(fday[2]);
		System.out.printf("������ �Ǵ� ��¥�� %d�� %d�� %d�� �Դϴ�.\n", year, month, day);
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day);

		for (int i=1; i<10; i++) {
			cal.add(Calendar.DATE, 100);
			System.out.printf(i*100 + "��° �Ǵ� �� : %tF%n", cal);
		}
	}
}

/*
