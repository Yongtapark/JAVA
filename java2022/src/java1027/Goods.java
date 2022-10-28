package java1027;

public class Goods {
	// 멤버필드 선언
	String name;// ="삼성 갤럭시";
	int price;// 묵시적 초기화
	int numberOfStock;
	int sold;

	// 디폴트 생성자 정의
	public Goods() {
		System.out.println("디폴트 생성자");
	}

	// 모두 다 있는 생성자 정의
	public Goods(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}

	// setter()/getter() 정의
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getnumberOfStock() {
		return numberOfStock;
	}
	public int getSold() {
		return sold;
	}
	//setter()
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock=numberOfStock;
	}
	public void setSold(int Sold) {
		this.sold=sold;
	};
	
//------------------------------------------------------------------------
	public static void main(String[] args) {
		Goods carmera = new Goods();// 디폴트 생성자 호출
		Goods carmera2 = new Goods("냉장고", 1000, 10, 3);
		System.out.println("명시적 초기화------------------");
		System.out.println("상품이름 :" + carmera.name);
		System.out.println("묵시적 초기화------------------");
		System.out.println("상품가격 :" + carmera.price);
		carmera.name = "nikon";
		carmera.price = 400000;
		carmera.numberOfStock = 30;
		carmera.sold = 50;
		int value=10;

		System.out.println("camera------------------");
//		System.out.println("상품이름 :" + carmera.name);
//		System.out.println("상품가격 :" + carmera.price);
//		System.out.println("재고 수량 :" + carmera.numberOfStock);
//		System.out.println("팔린 수량 :" + carmera.sold);
		carmera.disp(carmera,value);//호출//주소전달 ,value=값 전달
		// carmera2-------------------------------------------------
		System.out.println("camera2------------------");
//		System.out.println("상품이름 :" + carmera2.name);
//		System.out.println("상품가격 :" + carmera2.price);
//		System.out.println("재고 수량 :" + carmera2.numberOfStock);
//		System.out.println("팔린 수량 :" + carmera2.sold);
//		System.out.println(carmera.name);
		carmera2.disp(carmera2,value);//주소전달 ,value=값 전달
		//간접접근해서 값 저장 후 출력
		System.out.println("간접접근---------------------");
		Goods carmera3 =new Goods();
		carmera3.setName("cannon");
		//camera3.getName();
		carmera3.setPrice(200);
		//camera3.getPrice();
		carmera3.setNumberOfStock(3);
		//camera3.getnumberOfStock();
		carmera3.setSold(2);
		//camera3.getSold();
		
//		System.out.println("상품이름 :" + camera3.getName());
//		System.out.println("상품가격 :" + camera3.getPrice());
//		System.out.println("재고 수량 :" + camera3.getnumberOfStock());
//		System.out.println("팔린 수량 :" + camera3.getSold());
		carmera3.disp(carmera3,value);//주소전달 ,value=값 전달
		System.out.println("---------static 으로 함수호출-----------------");
		disp2(carmera3,value);//주소전달 ,value=값 전달//같은 클래스일때 사용(가)
		//carmera3.disp2(carmera3,value);
		//Goods.disp2(carmera,value);<= 다른 클래스에서는 이렇게 사용(나)

	}
	public void disp(Goods carmera,int value) {
		//camera :call by address방식(주소전달방식)==call by reference==호출해서 작업을 하고 들어오면 값 변경되어있다. 뭔소리야
		//value : call by value(값 전달 방식);호출하고 작업을 하고 돌아오면 값 변화가 없다.
		System.out.println("상품이름 :" + carmera.name);
		System.out.println("상품가격 :" + carmera.price);
		System.out.println("재고 수량 :" + carmera.numberOfStock);
		System.out.println("팔린 수량 :" + carmera.sold);
		System.out.println("value : "+value);//< call by value
	}
	
	public static void disp2(Goods carmera,int value) {//(가),(나)번처럼 불러도 됨.
		System.out.println("상품이름 :" + carmera.name);
		System.out.println("상품가격 :" + carmera.price);
		System.out.println("재고 수량 :" + carmera.numberOfStock);
		System.out.println("팔린 수량 :" + carmera.sold);
		System.out.println("value : "+value);//< call by value
	}
}
