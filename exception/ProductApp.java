import java.io.*;

public class ProductApp {

	// 상품정보 텍스트 한 줄을 전달 받아서 
	// 잘 잘라서 Product에 담아서 반환하는 메소드
	public static Product parseData(String text) {
		Product p = new Product();

		String[] st = text.split(",");

		p.setName(st[0]);
		p.setMaker(st[1]);
		p.setPrice(Integer.parseInt(st[2]));
		p.setDis(Double.parseDouble(st[3]));

		return p;
	}

	public static void main(String[] args) throws Exception {
		Product[] products = new Product[4];

		BufferedReader reader = new BufferedReader(new FileReader("Product.txt"));
		
		products[0] = parseData(reader.readLine());
		products[1] = parseData(reader.readLine());
		products[2] = parseData(reader.readLine());
		products[3] = parseData(reader.readLine());

		for (Product p : products) {
			System.out.printf("%s %s %d %f\n", p.getName(), p.getMaker(), p.getPrice(), p.getDis());
		}	
	}
}

/*
		System.out.println("상품명: " + products[0].getName());
		System.out.println("제조사: " + products[0].getMaker());
		System.out.println("가  격: " + products[0].getPrice());
		System.out.println("할인율: " + products[0].getDis());

		System.out.println("상품명: " + products[0].getName());
		System.out.println("제조사: " + products[0].getMaker());
		System.out.println("가  격: " + products[0].getPrice());
		System.out.println("할인율: " + products[0].getDis());

		System.out.println("상품명: " + products[0].getName());
		System.out.println("제조사: " + products[0].getMaker());	
		System.out.println("가  격: " + products[0].getPrice());
		System.out.println("할인율: " + products[0].getDis());

		System.out.println("상품명: " + products[0].getName());
		System.out.println("제조사: " + products[0].getMaker());
		System.out.println("가  격: " + products[0].getPrice());
		System.out.println("할인율: " + products[0].getDis());
		*/