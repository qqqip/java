public class Address {
	
	private String zipcode;
	private String sido;
	private String gugun;
	private String detail;

	public Address() {}
	public Address(String zipcode, String sido, String gugun, String detail) {
		this.zipcode = zipcode;
		this.sido = sido;
		this.gugun = gugun;
		this.detail = detail;
	}

	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getSido() {
		return sido;
	}
	public void setSido(String sido) {
		this.sido = sido;
	}
	public String getGugun() {
		return gugun;
	}
	public void setGugun(String gugun) {
		this.gugun = gugun;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
}

