import java.util.Arrays;

public class ProductApp3 {
	public static void main(String[] args) {
		Product[] cart = new Product[5];
		cart[0] = new Product("볼펜", 3000);
		cart[1] = new Product("액자", 16000);
		cart[2] = new Product("연필", 1000);
		cart[3] = new Product("샤프", 25000);
		cart[4] = new Product("지우개", 500);

		System.out.println(Arrays.toString(cart));	//Arrays 안에있는 toString = displayinfo 와 비슷한 개념 // 배열의 내용을 보여줌
	
	}
}