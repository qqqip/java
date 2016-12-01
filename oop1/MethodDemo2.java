public class MethodDemo2 {

	public static void a() {
	}
	
	public static void displayGugudan(int dan) {
		
		for (int i=1; i<10; i++) {
			
			System.out.println(dan + "*" + i + "=" + (dan*i));
			// System.out.printf("%d * %d = %d\n" , x, y, (dan*i));

		}
	}
	
	public static void main(String[] args) {
		displayGugudan(8);
		displayGugudan(19);
		displayGugudan(199999);
		
	}
}