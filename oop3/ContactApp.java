import java.util.Scanner;

public class ContactApp {	// 연락처 정보를 입력받는 화면 클래스
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);	// 사용자의 입력을 읽어오는 Scanner 객체 생성하기 
		
		Contact[] contacts = new Contact[100];
		int currentPosition = 0;	// 배열의 자리수

		
		for (;;) {	// 연속 3개 입력을 위한 포문
			System.out.println("1:등록 2:조회 0:종료");
			System.out.println("메뉴 번호를 입력하세요");
			int menuNo = sc.nextInt();
			
			if (menuNo == 1) {	// 배열에 등록하기	// currentPosition이 가르키는 위치에 Contact를 저장하고 currentPosition의 값을 1 증가시킨다. 
				// 연락처 정보 등록받기 
				System.out.print("번호를 입력하세요: ");
				int no = sc.nextInt();
				System.out.print("이름을 입력하세요: ");
				String name = sc.next();
				System.out.print("전화번호를 입력하세요: ");
				String phone = sc.next();
				System.out.print("이메일 입력하세요: ");
				String email = sc.next();

				// Contact 객체 생성하고, 값을 담기 
				Contact contact = new Contact();
				contact.setNo(no);
				contact.setName(name);
				contact.setPhone(phone);
				contact.setEmail(email);
				
				// 배열에 저장하기
				contacts[currentPosition]  = contact;
				currentPosition++;


			} else if (menuNo == 2) {	// 배열에 저장된 모든 연락처 정보 표시하기- 인헨스드 포문 사용하면 에러 // 배열에서 0부터 currentPosition이 가르키는 위치 앞까지 반복해서 출력
				for (int i=0; i<currentPosition; i++) {
					Contact c = contacts[i];

					System.out.printf("%d %s %s %s\n",
							c.getNo(), c.getName(), c.getPhone(), c.getEmail());
				}
			} else if (menuNo == 0) {
				break;
			}
		}
	}
}