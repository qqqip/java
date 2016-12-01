public class Contact {
	
	private String name;
	private Tel[] tels = new Tel[50];
	private Address address;	// 포함관계 

	private int count = 0;

	public Contact() {}
	public Contact(String name, Tel[] tels, Address address) {
		this.name = name;
		this.tels = tels;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addTel(Tel tel) {
		// tel 배열의 적절한 위치에 담기 
		for(int i=0; i<tels.length; i++) {
			if ( tels[i] == null) {
				tels[i] = tel;
				count ++;
			}
		}
	}
	

	public Tel[] getTels() {
		return tels;
	}
	public void setTels(Tel[] tels) {
		this.tels = tels;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	// Object로부터 물려받은 toString() 재정의하기
	public String toString() {
		return "{name:"+name+", tels:"+tels+", address:"+address+"}";
	}



}