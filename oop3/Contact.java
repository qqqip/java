public class Contact {
/*
// ����ó ���� ���α׷�// ����ó�� ����� �� �ִ�. // ��ϵ� ����ó�� ��ȸ�� �� �ִ�. 

1. ����ó ����(��ȣ, �̸�, ��ȭ��ȣ, �̸���)�� ������ �� �ִ� ��ü�� ���赵 ����� 
2. ������ ��� �����ϱ� 
	- ��ϱ�� : �迭�� Contact ��ü�� �����ϴ� ���� �����ϱ� 
	- ��ȸ��� : �迭�� ����� ��� Contact ��ü�� ������ ǥ���ϴ� ���� �����ϱ� 

//�ʿ��� Ŭ���� : Contact Ŭ����-������ ǥ���ϴ� Ŭ���� 
				  ContactMgr Ŭ����-������ ����, ��ȸ�ϴ� ����� ������ Ŭ����
				  ContactApp Ŭ����-�������� �Ǵ� Ŭ���� 
*/

private int no;
private String name;
private String phone;
private String email;

// �⺻������

public Contact() {}

public Contact(int no, String name, String phone, String email) {
this.no = no;
this.name = name;
this.phone = phone;
this.email = email;
}

// getter/setter ������
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void info() {
			System.out.printf("%d %s %s %s\n", no, name, phone, email);
	}
}