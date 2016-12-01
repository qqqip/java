public class Member {

	// 필드 정의 (은닉화)
	private String name;
	private String id;
	private String password;
	private int age;

	// 기본 생성자 정의
	public Member() {}
	

	// getter/setter 정의
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}