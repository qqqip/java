public class Employee {
			
		private String name;
		private String dep;
		private String position;
		private String salary;

		public Employee() {}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDep() {
			return dep;
		}
		public void setDep(String dep) {
			this.dep = dep;
		}
		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		public void employeeInfo() {
			System.out.println("���� :" + this.getName());	
			System.out.println("�μ� :" + this.getDep());	
			System.out.println("��å :" + this.getPosition());	
			System.out.println("���� :" + this.getSalary());	
		}
}