public class ArrayService {
		
	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    

	// �迭 �̵���Ű�� 
	// arr1�迭���� ������ ���ڸ� �� �ڷ� ������ 
	public int[] move(int no) {	// ���ڸ� ������
		int temp = arr1[no-1];	//�迭 �ڸ����� no-1
		for (int i=no-1; i<9; i++) {
			arr1[i] = arr1[i+1];
		}
		arr1[9] = temp;
		return arr1;
	} 

	// (5,2) 5��°�� �������� �ι� 123456789 --> 345678912
	public int[] shift(int begin, int step) {
	
	}

	// �迭 �����ϱ�
	// arr2 �迭�� ������ ��ġ���� ������ ���� �� �迭�� ��ȯ�ϱ�
	public int[] copy(int index) {
		int[] result = new int[arr2.length = index];

		for(int i=index; i<arr2.length; i++) {
			result[i-index] = arr2[i];
		}

		return result;		
	}

	// �迭 �߶󳻱�
	// arr2�迭�� ������ ��ġ���� ������ ��ġ���� ������ �迭�� ��ȯ�ϱ�
	public int[] cut(int begin, int end) {
		int[] result = new int[end-begin+1];

		for (int i=begin; i<=end; i++) {
			result[i-begin] = arr3[i];
		}

		return result;

	}
	/*
	1�� ��
	int[] result = new int[arr1.length];

	// ������ ���ڸ� �̸� �����س���. // ���� ���� 
	int temp = arr1[no-1];
	// 3��° ���� ������ �� ĭ�� �ű�� �ȴ�. 
	int position = 0;
	for (int i=no; i<arr.length; i++) {
		result[no-1+i] = arr1[i];
	}
	// ���� ó�� ���������� ���� �̸� �����س���. 
	int number = arr1[no-1];
	// �迭�� ���� �� ĭ�� ������ �̵���Ű��.
	for(int i=no; i<arr1.length; i++) {
		result[i-1] = arr[i];

	// �� ������ ĭ�� �Ʊ� �����صξ��� ���� ����.


	for (int i=0; i<arr1.length; i++) {
		result[i] = arr1[i];
	}
	int number = arr1[no-1];
	for(int i=no; i<arr1.length; i++) {
		result[i-1] = arr[i];
	}



	System.out.println(java.util.Arrays.toString(result));
	return result;
	}

	public static void main(String[] args) {
		Arr1[] s = new Arr1();
		s.move(3);
	}

	
	
	}
	*/
}