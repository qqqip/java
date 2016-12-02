import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		// 이름을 여러개 저장할 수 있는 ArrayList 만들기
		ArrayList<String> names = new ArrayList<String>();		// 문자열 10개 담을 수 있는 객체가 만들어진다.

		// ArrayList에 String객체 저장하기 
		names.add("박재범");
		names.add("박재범");
		names.add("박재범");
		names.add("박재범");
		names.add("박재범");
		names.add("박재범");
		names.add("박재범");
		names.add("서강준");
		names.add("이석훈");
		names.add("성시경");

		// ArrayList에 저장된 모든 element 삭제하기
		// names.clear();

		// AarrayList에 저장된 element 개수 조회하기 
		int len = names.size();
		System.out.println("저장된 개수: " + len);
			
		// ArrayList에 element가 저장되어 있는지 확인하기
		boolean empty = names.isEmpty();
		if (!empty) {
			System.out.println("element가 존재하는 ArrayList다.");
		} else {			
			System.out.println("비어있는 ArrayList다.");
		}

		for (String username : names) {
			System.out.println(username);
		}

		/*
		for (int i=0; i<len; i++) {
			String username = names.get(i);
			System.out.println(username);
		}
		*/
		/*
		String name1 = names.get(0);
		String name2 = names.get(1);
		String name3 = names.get(2);
		String name4 = names.get(3);
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		*/
	}
}