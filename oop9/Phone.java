public class Phone extends Object {
	private String tel;
	private String company;

	public Phone() {
		System.out.println("Phone() is running");
	}

	public Phone(String tel, String company) {
		super();
		System.out.println("Phone(String, String) is running");
		this.tel = tel;
		this.company = company;
	}
	public String getTel() {
		return tel;
	}
	public String getCompany() {
		return company;
	}
}