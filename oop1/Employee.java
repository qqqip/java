public class Employee {

	int employeeNo;
	String name;
	String number;
	String dep;
	String position;
	int salary;

	//��������ؼ� ��ȯ�ϴ� �޼ҵ�
	public int getAnnualSalary() {
		return salary * 12;
	}

	public void infoEmployee() {
		System.out.println("�����ȣ��\t" + employeeNo + "�� �Դϴ�.");
		System.out.println("�̸���\t" + name + "�Դϴ�.");
		System.out.println("��ȭ��ȣ��\t" + number + "�� �Դϴ�.");
		System.out.println("�Ҽ���\t" + dep + "�μ��Դϴ�.");
		System.out.println("������\t" + position + "�Դϴ�.");
		// System.out.println("������\t" + getAnnualSalary + "�� ���Դϴ�.");
	}
}

/*
�������� :
ublic void annualSalary() {
		System.out.println("����: " + (salary*12));
public int getAnnualSalary() {
	return salary * 12;
}
*/

