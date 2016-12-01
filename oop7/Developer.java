public class Developer extends Employee {
	
	int todo;
	int completed;


	// 개발에 맞게 print() 메소드 재정의하기 
	public void print() {
		System.out.println("사원번호: " + no);
		System.out.println("이	  름: " + name);
		System.out.println("개발업부: " + todo);
		System.out.println("완료건수: " + completed);
		System.out.println("진 척 률: " + completed/(double)todo);
		System.out.println();
	}

	public void develop() {
		System.out.println("업무수행");
		completed++;

	}
}