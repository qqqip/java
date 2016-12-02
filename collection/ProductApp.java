import java.util.Scanner;

public class ProductApp {
	public static void main(String[] args) {
	
		ProductRepository repo = new ProductRepository();

		Scanner sc = new Scanner(System.in);

		// 입력값 읽어오기
		System.out.println("상품번호를 입력하세요");
		int no = Integer.parseInt(sc.nextLine());
		System.out.println("상품명을 입력하세요");
		String name = sc.nextLine();

		// 입력값을 담을 객체 만들기 
		Product p = new Product();

		// 생성된 객체에 입력값 담기
		p.setNo(no);
		p.setName(name);
		
		// db의 값을 저장해주는 메소드에 값을 담고 있는 객체를 전달하기
		repo.addProduct(p);

		repo.displayProducts();
	}
}