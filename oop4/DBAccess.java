// database access 기능이 구현된 클래스 
public class DBAccess {

	// DBAccess 객체를 생성해서 static 변수에 저장한다. 
	private static DBAccess db = new DBAccess();
	// 생성자를 은닉화시킨다. 
	private DBAccess() {}

	// 생성된 DBAccess 객체를 참조할 수 있는 참조값을 제공해주는
	// 정적 메소드를 제공한다. 
	public static DBAccess getInstance() {
		return db;
	}

	public void insert() {
		System.out.println("추가 작업");		
	}

	public void update() {
		System.out.println("수정 작업");
	}

	public void delete() {
		System.out.println("삭제 작업");
	}

	public void retrieve() {
		System.out.println("조회 작업");
	}

}