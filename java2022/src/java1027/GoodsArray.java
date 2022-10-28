package java1027;

import java.util.Scanner;

class Goods3{
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	public Goods3(String name,int price,int numberOfStock,int sold){
		this.name=name;this.price=price;
		this.numberOfStock=numberOfStock;
		this.sold=sold;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getNumberOfStock() {
		return numberOfStock;
	}
	public int getSold() {
		return sold;
	}//class
}
public class GoodsArray {

	public static void main(String[] args) {
		Goods3[] goodsArray;
		goodsArray=new Goods3[3];
		
		Scanner s=new Scanner(System.in);
		System.out.println("상품 가격 재고량 판매량 : ");
		for(int i=0; i<goodsArray.length;i++) {
			String name=s.next();
			int price=s.nextInt();
			int numberOfStock=s.nextInt();
			int sold=s.nextInt();
			goodsArray[i]=new Goods3(name,price,numberOfStock,sold);
		}
		//출력
		for(int i=0;i<goodsArray.length;i++) {
			System.out.print(goodsArray[i].getName()+" ");
			System.out.print(goodsArray[i].getPrice()+" ");
			System.out.print(goodsArray[i].getNumberOfStock()+" ");
			System.out.print(goodsArray[i].getSold()+" ");
			System.out.println();
		}

	}

}
