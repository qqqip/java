public class Quizz6 {
	public static void main(String[] args) {
		String text = "ȫ�浿,������,����,200^������,������,����,300^������,�ѹ���,�븮,150^�̼���,�ѹ���,����,250";
		//^¥���� �迭�� ���
		text = text.replace(" ","");
		String[] text2 = text.split("\\^"); 
		Employee[] employees = new Employee[4];
		//�迭�� ��������� �ϳ��� �����ؼ� , �� �ڸ��� �迭�� �� ���
		for (int i=0; i<text2.length; i++) {
			employees[i] = new Employee();	// ��ü���� : �⺻�����ڸ� �����ض� 
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