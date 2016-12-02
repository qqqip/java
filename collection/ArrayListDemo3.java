import java.util.ArrayList;

public class ArrayListDemo3 {
	public static void main(String[] args) {
	
	// �⺻ �ڷ������� �����ϴ� ArrayList �����
	// �⺻ �ڷ��� Ÿ�Կ� �����Ǵ� Wrapper Ŭ���� Ÿ���� ArrayList�� Ÿ������ �����Ѵ�. 
	// ArrayList<Integer>, ArrayList<Double>, ...

	// ������ ������ �����ϴ� ArrayList �����
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	numbers.add(new Integer(12));
	numbers.add(23);	// numbers.add(new Integer(23));		// ����ڽ�
	numbers.add(16);	// numbers.add(new Integer(16));		// ����ڽ�
	numbers.add(5);		// numbers.add(new Integer(5));			// ����ڽ� 

	/*
	Integer e1 = numbers.get(0);
	Integer e2 = numbers.get(1);
	Integer e3 = numbers.get(2);
	Integer e4 = numbers.get(3);


	ArrayList���� �ϳ� ������ Integer��ü�� ���������
	��� ������ int Ÿ���̸� �ڵ����� Integer��ü�� ����� �������� ������. 
		
	*/

	int e1 = numbers.get(0);	// int e1 <--- x.intValue() <--- Integer x = numbers.get(0)
	int e2 = numbers.get(1);	// int e2 = numbers.get(1).intValue();
	int e3 = numbers.get(2);	// int e3 = numbers.get(2).intValue();
	int e4 = numbers.get(3);	// int e4 = numbers.get(3).intValue();

	System.out.println(e1 + "," + e2 +"," + e3 + "," + e4);
	
	for (int num : numbers) {
		System.out.println(num);
	}

		/*
		�⺻�ڷ����� ��ü��
		int Integer
		byte Byte
		short Short
		float Float
		double Double
		char character
		
		int a = 19;
		Integer a = new Integer(19);	// 19�� ����ִ� ��Ƽ�� ��ü a
		Integer a = 13;

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(new Integer(12));	// 12�� ����Ǵ°� �ƴϰ� ��Ƽ�� ��ü�� �����
		numbers.add(12);	---> numbers.add(new Integer(12));

		*/
	}
}