public class Student {
	private int no;
	private int grade;
	private String name;
	private String phone;

	public Student() {}
	public Student(int no, int grad, String name, String phone) {
		this.no = no;
		this.grade = grade;
		this.name = name;
		this.phone = phone;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}