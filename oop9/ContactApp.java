public class ContactApp {
	public static void main(String[] args) {
		
		// 주소록정보(이름, 여러개의 전화번호, 주소)를 저장하는 객체 생성
		Contact contact = new Contact();
		
		// 이름 정보 저장
		String name = "박재범";
		contact.setName(name);

		// 전화번호 정보 저장
		Tel[] phones = new Tel[10];

		Tel tel1 = new Tel();
		tel1.setType("폰");
		tel1.setNumber("010-222-2222");
		phones[0] = tel1;

		Tel tel2 = new Tel();
		tel2.setType("직장");
		tel2.setNumber("02-1234-5678");
		phones[1] = tel2;

		// 배열에 넣어줌
		contact.setTels(phones);

		// 주소 정보 저장
		Address addr = new Address();
		addr.setSido("서울 특별시");
		addr.setGugun("종로구");
		addr.setDetail("봉익동 디아망빌딩 401호");

		contact.setAddress(addr);

	}
}