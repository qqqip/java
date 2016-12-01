import java.util.Arrays;

public class ProductApp {
	public static void main(String[] args) {
		Product[] cart = new Product[5];
		cart[0] = new Product("볼펜", 3000);
		cart[1] = new Product("액자", 16000);
		cart[2] = new Product("연필", 1000);
		cart[3] = new Product("샤프", 25000);
		cart[4] = new Product("지우개", 500);

		//Arrays.sort(cart, (a, b) -> b.getPrice() - a.getPrice()); // 내림차순

		Arrays.sort(cart);

		for (Product p : cart) {
			System.out.println(p.getName() + "" + p.getPrice());
		}
	}
}