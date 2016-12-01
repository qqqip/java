public class ArrayService {
		
	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    

	// 배열 이동시키기 
	// arr1배열에서 선택한 숫자를 맨 뒤로 보내기 
	public int[] move(int no) {	// 숫자를 뽑으면
		int temp = arr1[no-1];	//배열 자리수는 no-1
		for (int i=no-1; i<9; i++) {
			arr1[i] = arr1[i+1];
		}
		arr1[9] = temp;
		return arr1;
	} 

	// (5,2) 5번째를 왼쪽으로 두번 123456789 --> 345678912
	public int[] shift(int begin, int step) {
	
	}

	// 배열 복사하기
	// arr2 배열을 지정된 위치부터 끝까지 복사 한 배열을 반환하기
	public int[] copy(int index) {
		int[] result = new int[arr2.length = index];

		for(int i=index; i<arr2.length; i++) {
			result[i-index] = arr2[i];
		}

		return result;		
	}

	// 배열 잘라내기
	// arr2배열을 지정된 위치부터 지정된 위치까지 복사한 배열을 반환하기
	public int[] cut(int begin, int end) {
		int[] result = new int[end-begin+1];

		for (int i=begin; i<=end; i++) {
			result[i-begin] = arr3[i];
		}

		return result;

	}
	/*
	1번 답
	int[] result = new int[arr1.length];

	// 지정된 숫자를 미리 보관해놓자. // 원본 복사 
	int temp = arr1[no-1];
	// 3번째 부터 앞으로 한 칸씩 옮기면 된다. 
	int position = 0;
	for (int i=no; i<arr.length; i++) {
		result[no-1+i] = arr1[i];
	}
	// 제일 처음 덮혀쓰여질 값을 미리 보관해놓자. 
	int number = arr1[no-1];
	// 배열의 값을 한 칸씩 앞으로 이동시키자.
	for(int i=no; i<arr1.length; i++) {
		result[i-1] = arr[i];

	// 맨 마지막 칸에 아까 보관해두었던 값을 담자.


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