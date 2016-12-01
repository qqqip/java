import java.util.*;
import java.util.Scanner;

public class dDay {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 입력하세요: (예: 2016-11-01) ");
		String date = sc.next();
		String[] fday = date.split("-");
				
		int year = Integer.parseInt(fday[0]);
		int month = Integer.parseInt(fday[1]);
		int day = Integer.parseInt(fday[2]);
		System.out.printf("기준이 되는 날짜는 %d년 %d월 %d일 입니다.\n", year, month, day);
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day);

		for (int i=1; i<10; i++) {
			cal.add(Calendar.DATE, 100);
			System.out.printf(i*100 + "일째 되는 날 : %tF%n", cal);
		}
	}
}

/*
