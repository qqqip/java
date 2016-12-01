// 추상 클래스
public abstract class DBAccess {
	
	// 구현메소드
	public void connect() {
		System.out.println("db와 연결합니다.");
	}
	
	// 추상화메소드
	public abstract void createRepository();

	// 구현메소드
	public void disconnect() {
		System.out.println("db와 연결을 해제합니다.");
	}
}