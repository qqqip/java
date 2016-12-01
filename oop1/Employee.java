public class Employee {

	int employeeNo;
	String name;
	String number;
	String dep;
	String position;
	int salary;

	//연봉계산해서 반환하는 메소드
	public int getAnnualSalary() {
		return salary * 12;
	}

	public void infoEmployee() {
		System.out.println("사원번호는\t" + employeeNo + "번 입니다.");
		System.out.println("이름은\t" + name + "입니다.");
		System.out.println("전화번호는\t" + number + "번 입니다.");
		System.out.println("소속은\t" + dep + "부서입니다.");
		System.out.println("직위는\t" + position + "입니다.");
		// System.out.println("연봉은\t" + getAnnualSalary + "만 원입니다.");
	}
}

/*
연봉오답 :
ublic void annualSalary() {
		System.out.println("연봉: " + (salary*12));
public int getAnnualSalary() {
	return salary * 12;
}
*/

