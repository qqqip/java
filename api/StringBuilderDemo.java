public class StringBuilderDemo {
	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder();
		sb.append("중앙hta 학원");
		  .append("정규과정안내");
		  .append("\n");
		  .append("전자정부표준프레임워크 과정");
		  .append("소프트웨어 응용프로그램 개발자 과정");
		  .append("\n");
		  .append("수강기간(일): ");
		  .append(120);
		
		String text = sb.toString();
		System.out.println(text);






	}
}