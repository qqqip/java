public class ProductApp4 {
	public static void main(String[] args) throws CloneNotSupportedException {
	
		Product original  = new Product("����", 500);
				
		Product copyProduct = original.copy();
		System.out.println(copyProduct);

	}
}