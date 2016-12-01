import java.io.*;

public class StudentApp1 {
	public static void main(String[] args) throws Exception {
		/*
		score.txt 파일을 읽어서 성적정보를 읽어서 화면에 출력하는 프로그램
		1. 학생정보를 담는 Student 클래스 정의하기 
		2. StudentApp 정의하기 
			- FileReader 와 BufferedReader를 사용해서 파일 내용을 읽어오기 
			- 읽어온 내용을 , 기준으로 자르기 
			- 잘라낸 내용을 Student 객체를 생성해서 저장하기 
				(점수는 숫자로 변환하기: int Integer.parseInt(글자))
			- Student 객체에 저장된 내용을 화면에 표시하기
			*/

		BufferedReader reader = new BufferedReader(new FileReader("score.txt"));
		String text = reader.readLine();
		String[] stu = text.split(",");

		Student st1 = new Student();	// 객체 생성 
		
		int kor = Integer.parseInt(stu[2]);
		int math = Integer.parseInt(stu[3]);
		int eng = Integer.parseInt(stu[4]);
		

		st1.setName(stu[0]);
		st1.setGrade(stu[1]);
		st1.setKor(kor);
		st1.setMath(math);
		st1.setEng(eng);
	
		System.out.println("이름: " + st1.getName());
		System.out.println("학년: " + st1.getGrade());
		System.out.println("국어점수: " + st1.getKor());
		System.out.println("수학점수: " + st1.getMath());
		System.out.println("영어점수: " + st1.getEng());










	}
}