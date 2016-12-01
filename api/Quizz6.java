public class Quizz6 {
	public static void main(String[] args) {
		String text = "홍길동,영업팀,과장,200^김유신,영업팀,부장,300^강감찬,총무부,대리,150^이순신,총무부,차장,250";
		//^짜르고 배열에 담기
		text = text.replace(" ","");
		String[] text2 = text.split("\\^"); 
		Employee[] employees = new Employee[4];
		//배열에 사원정보를 하나씩 추출해서 , 로 자르고 배열에 또 담기
		for (int i=0; i<text2.length; i++) {
			employees[i] = new Employee();	// 객체생성 : 기본생성자를 수행해라 
			String[] str = text2[i].split(","); 

			employees[i].setName(str[0]);
			employees[i].setDep(str[1]);
			employees[i].setPosition(str[2]);
			employees[i].setSalary(str[3]);

			employees[i].employeeInfo();		
			}
	}
}	
/*
		text = text.replace(" ","");
		String[] arr = text.split("\\^");
		int j = 0;
		for(int i = 0 ; i < arr.length ; i++){
	
			employees[i] = new employee();


			j = arr[i].indexOf(",");
			employees[i].setName(arr[i].substring(0,j);
			arr[i] = arr[i].substring(j+1,arr[i].length());

			j = arr[i].indexOf(",");
			employees[i].setName(arr[i].substring(0,j);
			arr[i] = arr[i].substring(j+1,arr[i].length());

			j = arr[i].indexOf(",");
			employees[i].setName(arr[i].substring(0,j);
			arr[i] = arr[i].substring(j+1,arr[i].length());

			j = arr[i].indexOf(",");
			employees[i].setName(Integer.parseInt(arr[i].substring(0,j));
			arr[i] = arr[i].substring(j+1,arr[i].length());
		}
*/