public class Contact {
	
	private String name;
	private Tel[] tels = new Tel[50];
	private Address address;	// ���԰��� 

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
		// tel �迭�� ������ ��ġ�� ��� 
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
	// Object�κ��� �������� toString() �������ϱ�
	public String toString() {
		return "{name:"+name+", tels:"+tels+", address:"+address+"}";
	}



}