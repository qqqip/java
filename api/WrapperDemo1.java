public class WrapperDemo1 {
	public static void main(String[] args) {

	// ���� 23�� ������ �ִ� Integer ��ü�� �����ϴ� a 
	Integer a = new Integer(123);		// <-------�ڽ� Boxing
	// Integer ��ü�� ������ �������� ��ȯ�ϴ� �޼ҵ� : int intValue();
	int x = a.intValue();				// <------��ڽ� unBoxing
	double y = a.doubleValue();

	System.out.println(x);
	System.out.println(y);

	// ���� 23�� �����ϰ� �ִ� �⺻�ڷ��� Ÿ���� ����
	int b = 23;
	}
}