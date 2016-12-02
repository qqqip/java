import java.util.ArrayList;

public class ArrayListDemo4 {
	public static void main(String[] args) {

		// 과목명을 저장하는 ArrayList 만들기 	
		ArrayList<String> subjects = new ArrayList<String>();
		subjects.add("자바");
		subjects.add("자바스크립트");
		subjects.add("SQL");
		subjects.add("하둡");
		

		// subjects.remove("SQL");	// 지정한 객체와 일치하는 객체를 찾아서 지우기
		subjects.remove(2);			// 지정한 위치에 저장된 객체를 지우기

		System.out.println(subjects);


	}
}