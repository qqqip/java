public class MethodDemo4 {

	// 이등변삼각형의 넓이를 계산하는 메소드 
	// 너비와 높이를 전달받아서 면적을 계산하는 메소드
	public static double area(double width, double height) {
		double result = (width*height)/2;

		return result;
	
	}
	
	
	
	public static void main(String[] args) {
	
		double a1 = area(4.0, 3.0);
		System.out.println(a1);

		

	}
}