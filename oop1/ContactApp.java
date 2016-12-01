public class ContactApp {
	public static void main(String[] args) {
				
		Contact c1 = new Contact();
		Contact c2 = new Contact();

		c1.no = 23;
		c1.name = "아리랑";
		c1.number= "010-222-4422";
		c1.email= "ariari@gmail.com";

		c2.no = 23;
		c2.name = "동동";
		c2.number= "010-8822-6453";
		c2.email= "dongdong@gmail.com";

		// 
		c1.call();
		c2.call();
		
*/
	}
}


		/*
		
		연락처 100개 필요함
		Contact[] c = new Contact[100];
		c[0] = c1;
		c[1] = c2;
		
		