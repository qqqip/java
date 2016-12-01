import java.util.Scanner;

public class ContactApp2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Contact contact = new Contact();
		Address addr = new Address();
		Tel a = new Tel();

		for (;;) {
			System.out.println("1.이름등록/수정 	2.전화번호등록	 3.주소등록/수정  4.조회	0.종료 ");

			System.out.print("메뉴를 선택하세요:");
			int no = sc.nextInt();
			if(no == 1) {
				System.out.println("1. 이름 등록	2. 수정");
				System.out.print("메뉴를 선택하세요:");
				int menu = sc.nextInt();

				if(menu == 1) {
					// 이름을 입력받아서 Contact 에 저장한다.	
					System.out.println("저장할 이름을 입력하세요: ");
					String name = sc.next();
					contact.setName(name);
				} else  {
					System.out.println("수정하고 싶은 이름을 입력하세요: ");
					String name = sc.next();
					System.out.println("수정 후 이름: ");
					String name2 = sc.next();
					contact.setName(name2);
					// 수정된 이름이랑 정보 보여주기
					System.out.println(contact.getName());
					}
			} else if (no ==2) {
				// 전화번호 정보를 입력받아서 Contact에 저장합니다. 
				// Tel 객체 생성
				// 값 입력받아서 채우고
				System.out.println("등록할 전화번호를 입력하세요: ");
				String number = sc.next();
				System.out.println("1. 핸드폰	2. 개인		3. 집	4. 기타");
				String menu2 = sc.next();

				// Contact의 addTel(Tel tel)에게 Tel 객체 전달해서 배열에 담기 
				a.setNumber(number);
				a.setType(menu2);
				contact.addTel(a);
				System.out.println(contact.getName() + a.getNumber());

			} else if (no == 3) {
				// 주소 정보를 입력받아서 Contact에 저장합니다.
				System.out.println("저장할 주소의 우편번호를 입력하세요:");
				String zip = sc.next();
				System.out.println("저장할 주소의 시/도를 입력하세요:");
				String sd = sc.next();
				System.out.println("저장할 주소의 구/군을 입력하세요:");
				String gg = sc.next();
				System.out.println("저장할 주소의 상세주소를 입력하세요:");
				String dt = sc.next();

				// Address객체 생성 --> 값 입력받아서 채우고 -> Contact의 setter 이용해서 저장
				addr.setZipcode(zip);
				addr.setSido(sd);
				addr.setGugun(gg);
				addr.setDetail(dt);

				contact.setAddress(addr);

			} else if(no == 4) {
				// 연락처 정보를 화면에 표시합니다.
				System.out.println("이름: " + contact.getName());
				System.out.println("전화번호: " + a.getType()+ a.getNumber());
				System.out.println("주소: " + addr.getZipcode() + "\n" + addr.getSido() + "\n" + addr.getGugun() + "\n" + addr.getDetail() + "\n");
				ystem.out.println(Arrays.toString(cart));
				
			
			} else if(no == 0) {
				// 프로그램을 종료합니다. 
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}