public class SmartPhoneApp {
	public static void main(String[] args) {
		/*
		SmartPhone smart = new SmartPhone();
		smart.setTelNumber("010-333-3333");
		smart.setCompany("KT");
		smart.setIp("192.168.10.23");
		
		smart.displayInfo();
		*/

		SmartPhone smart = new SmartPhone("010-555-6666", "LGT", "192.168.10.23");
		smart.displayInfo();

		
	}
}