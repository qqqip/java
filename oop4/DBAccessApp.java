public class DBAccessApp {
	public static void main(String[] args) {
		
		// DBAccess 클래스는 생성자를 사용할 수 없다. 
		DBAccess db1 = new DBAccess();
		DBAccess db2 = new DBAccess();
		DBAccess db3 = new DBAccess();

		DBAccess db1 = DBAccess.getInstance{};		
		DBAccess db2 = DBAccess.getInstance{};		
		DBAccess db3 = DBAccess.getInstance{};		

		System.out.println(db1);
		System.out.println(db2);
		System.out.println(db3);
	}
}