import java.util.*;

public class ArrayListDemo2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		// 몇개 저장할지 크기를 미리 결정하지 않아도 된다. 
		ArrayList<String> names = new ArrayList<String>();
		

		while (true) {	// 조건식 대신 true를 넣어 항상 참으로 만듬 
			System.out.println("1.등록 2.조회 0.종료");
			System.out.println("선택>");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("등록할 이름을 입력하세요: ");
				String name = sc.next();
				names.add(name);

			} else if (menu == 2) {
				for ( String a : names) {
					System.out.println(a);
				}

			} else if (menu == 0) {
				break;
			} 
		}
	}
}