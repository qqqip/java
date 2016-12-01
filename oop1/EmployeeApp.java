public class EmployeeApp {
	public static void main(String[] args) {
	
	// 사원의 모든 정보를 출력하는 메소드

		Employee a = new Employee();

		a.employeeNo = 34;
		a.name = "재범";
		a.number = "010-3779-1658";
		a.dep = "마케팅";
		a.position = "사원";
		a.salary = 26000000;
	
		a.infoEmployee();

		/*
		int annualSalary = e.getAnnualSalary();
		System.out.println("연봉은\t" + getAnnualSalary + "만 원입니다.");
		*/
	
	}
}