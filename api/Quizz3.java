public class Quizz3 {
	public static void main(String[] args) {
		String text = "A mutable sequence of characters. This class provides an API compatible with StringBuffer, but with no guarantee of synchronization. This class is designed for use as a drop-in replacement for StringBuffer in places where the string buffer was being used by a single thread (as is generally the case). Where possible, it is recommended that this class be used in preference to StringBuffer as it will be faster under most implementations.";
		text = text.toLowerCase();
		
		int[] arr = new int[26];
		
		for(int i=0; i<text.length(); i++) {
			int value = text.charAt(i) - 97;
			if ( value >= 0) {
				arr[value]++;
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.println( (char)(i+97) + " : " + arr[i]);
		}
		// System.out.println(java.util.Arrays.toString(arr));

	}
}