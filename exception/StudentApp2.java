import java.io.*;
import java.text.DecimalFormat;

public class StudentApp2 {
	public static Student parseData(String text) {
		// �����͸� �޾Ƽ� ���� ��ü�� ����.
		Student a = new Student();
		// �����͸� �ɰ�
		text = text.trim();
	
		String [] str = text.split("\t");

		// Ÿ�� ��ȯ
			
		a.setName(str[0]);
		a.setGrade(str[1]);
		a.setKor(Double.parseDouble(str[2]));
		a.setMath(Double.parseDouble(str[3]));
		a.setEng(Double.parseDouble(str[4]));
		a.setTotal(Double.parseDouble(str[5]));
		a.setAvg(Double.parseDouble(str[6]));
		return a; 
	}
	public static void main(String[] args) throws Exception {
		Student[] students = new Student[10];

		BufferedReader reader = new BufferedReader(new FileReader("scores.txt"));
		String pattern = "##.##";
		DecimalFormat df = new DecimalFormat(pattern);

		students[0] = parseData(reader.readLine());
		students[1] = parseData(reader.readLine());
		students[2] = parseData(reader.readLine());
		students[3] = parseData(reader.readLine());
		students[4] = parseData(reader.readLine());
		students[5] = parseData(reader.readLine());
		students[6] = parseData(reader.readLine());
		students[7] = parseData(reader.readLine());
		students[8] = parseData(reader.readLine());
		students[9] = parseData(reader.readLine());
		
		for (Student a : students) {
			System.out.printf("%s %s %.1f %.1f %.1f %.1f %.1f\n", a.getName(), a.getGrade(), a.getKor(), a.getMath(), a.getEng(), a.getTotal(), a.getAvg());
		}
	}
}