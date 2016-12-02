import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo6 {
	public static void main(String[] args) {
		
		// 상품명을 저장하는 ArrayList 만들기 
		ArrayList<String> productNames = new ArrayList<String>();

		productNames.add("연필");
		productNames.add("색종이");
		productNames.add("가위");
		productNames.add("싸인펜");
		productNames.add("공책");
		productNames.add("책받침");
		productNames.add("색연필");
		/*
		Collections는 List, Set관련 객체를 다루는 유용한 정적 메소드를 가지고 있는 클래스다. 
		*/
		Collections.sort(productNames);
		System.out.println(productNames);


	}
}