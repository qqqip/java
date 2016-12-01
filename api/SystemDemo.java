import java.util.*;

public class SystemDemo {

	public static void main(String[] args) {

		// 현재 시간 정보 알아내기 1970-01-01
		long time = System.currentTimeMillis();
		System.out.println(time);

		long nanoTime = System.nanoTime();
		System.out.println(nanoTime);

		// 시스템의 환경변수값 조회하기
		String value1 = System.getenv("JAVA_HOME");
		System.out.println(value1);
		String value2 = System.getenv("PATH");
		System.out.println(value2);

		// 시스템의 프로퍼티값 조회

		// 현재 시스템의 줄바꿈문자 조회하기
		String newLineChar = System.getProperty("line.separator");
		System.out.println("abcdef"+newLineChar+"ghijk");

		// 현재 시스템의 사용자 홈 디렉토리 조회하기
		String dir = System.getProperty("user.home");
		System.out.println(dir);

		// 프로그램 종료하기
		// System.exit(0);

		// 배열 복사하기
		String[] src = {"이순신", "강감찬", "김유신", "홍길동", "일지매", "임꺽정"};
		String[] dest = new String[10];

		/*
		System.arraycopy(src, srcPosition, dest, destPosition, length)
			src			 : 원본배열
			srcPosition  : 원본 배열에서 복사할 항목의 시작 위치
			dest		 : 새 배열
			destPosition : 새 배열에서 복사할 항목을 붙여넣을 시작 위치 
			length		 : 원본 배열에서 복사할 항목의 갯수
		
		*/

		
		System.arraycopy(src, 3 , dest, 0, 2);

		System.out.println(Arrays.toString(dest));


	}
}