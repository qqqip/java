import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		
		// 메뉴 이름을 저장하는 HashSet객체 만들기 
		HashSet<String> menuset = new HashSet<String>();

		boolean r = false;
		r = menuset.add("쌀국수");
		System.out.println("쌀국수 ---> " + r);

		menuset.add("쌀국수");
		menuset.add("쌀국수");
		menuset.add("쌀국수");
		menuset.add("쌀국수");
		menuset.add("쌀국수");
		menuset.add("쌀국수");
		menuset.add("매운탕");
		menuset.add("칼국수");
		menuset.add("만두전골");
		menuset.add("샤브샤브");

		r = menuset.add("매운탕");
		System.out.println("매운탕 ---> " + r);

		int len = menuset.size();
		System.out.println(len);

		for (String menu : menuset) {
			System.out.println(menu);
		}
	}
}

// HashSet과 ArrayList 는 사용법이 똑같다. 다만, ArrayList는 순서보장