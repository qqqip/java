public class Morning implements Car {
	// 재정의
	public void on() {
		System.out.println("시동켜기");
	}
	public void off() {
		System.out.println("시동끄기");
	}
	public void run() {
		System.out.println("주행하기");
	}
	public void stop() {
		System.out.println("멈추기");
	}
	public void audio() {}
	public void navi() {}
	public void aircon() {}
	public void wiper() {}

}