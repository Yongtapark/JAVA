package java221102test;

public class Product {
	// 필드 생성
	private int productID; 		// 상품의 고유한 식별자
	private String description; // 상품설명
	private String maker; 		// 생산자
	private int price; 			// 가격정보

	// 생성자를 통해 초기화 선언
	public Product(int productID, String description, String maker, int price) {
		super();
		this.productID = productID;
		this.description = description;
		this.maker = maker;
		this.price = price;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void showInfo() {
		System.out.println("------------------------------");
		System.out.println("상품ID>> "+ productID);
		System.out.println("상품설명>> "+ description);
		System.out.println("생산자>> "+ maker);
		System.out.println("가격>> "+ price+"\n");
	}

}
