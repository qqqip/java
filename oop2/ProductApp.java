public class ProductApp {
	public static void min(String[] args) {
		
		// 상품을 5개 담는 배열을 정의하기 
		Product[] product = new Product[5]; 

		// 배열에 상품 다섯개 저장하기 
		product[0] = new Product(2, "바나나", "돌", 4900, 5, true);
		product[1] = new Product(8, "고구마", "해남", 5200, 7, true);
		product[2] = new Product(10, "감자", "수미", 4900, 10, true);
		product[3] = new Product(12, "우유", "파스퇴르", 4900, 11, true);
		product[4] = new Product(22, "토마토", "데체코", 4900, 13, true);
		
		// 배열에 저장된 상품중에서 판매중인 상품만 표시하기 
		for (Product a : product) {
			System.out.println("판매중인 상품: " + a.name);
		}

		// 배열에 저장된 상품중에서 가격이 10000원 이상인 상품만 표시하기 

		for (Product d : product) {
			if (d.salePrice() > 10000) {
				
			}
		}
		System.out.println("10000원 이상인 상품:" + d.salePrice());


		// 배열에 저장된 상품의 전체 가격을 표시하기 
		
		System.out.println("상품이름: " + d.name + "가격" + d.salePrice);
	}
}