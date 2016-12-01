public class RuntimeExceptionDemo {
	public static void main(String[] args) {
		// NullPointerException : 참조변수에 객체의 주소값 대신 null이 저장되어 있는 상태에서 속성이나 기능을 사용한 경우 발생한다. 

		String str = "abc";
		System.out.println(str.length());

		// 스트링을 3개 담을 수 있는 배열을 만듬
		String[] names = new String[3];
		names[0] = "홍길동";
		names[1] = "김유신";

		for (String name : names) {
			// System.out.println(name);
			// System.out.println(name == null ? "없음" : name);
			
			/*
			if (name != null) {
				System.out.println(name + "," + name.length());			
			}
			*/
		}
		// IndexOutOfBoundsException
			// 배열이나 String에서 인덱스 범위를 벗어난 값을 사용했을 때 발생한다. 
			String str2 = "abccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc";
			if (str2.length() > 30) {
				System.out.println( str2.substring(1, 30) + "..");
			} else {
				System.out.println( str2 );
			}
			/*
			ArithmeticException
			숫자를 0으로 나눌 때 발생한다. 
			System.out.println(23/0);
			*/
			
			// ClassCastException 
				// 클래스 타입 형변환 과정에서 오류가 있는 경우를 발생한다. 
			Phone p1 = new SmartPhone();
			FeaturePhone p2 = (FeaturePhone) p1;
			p2.flip();

	}
		
	public static class Phone {
	
	}

	public static class SmartPhone extends Phone {
		public void internet() {
			System.out.println("인터넷");
		}
	}
	
	public static class FeaturePhone extends Phone{
		public void flip() {
			System.out.println("접고펴기");		
		}
	}
}

