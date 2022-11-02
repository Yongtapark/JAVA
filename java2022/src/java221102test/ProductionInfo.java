package java221102test;

import java.util.Scanner;

public class ProductionInfo {
	// 정적필드 선언
	static int productID = 0;// 상품 고유 식별번호
	static int numberOfProduct = 0;
	static Product[] p = new Product[3]; //상품의 최대갯수

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);

		int choice = 0;
		while (choice != 3) {
			int type;
			System.out.println("상품추가(1) 모든상품조회(2) 끝내기(3)");
			choice = sin.nextInt();
			switch (choice) {
			case 1:// 상품추가
				if (numberOfProduct > p.length) {
					System.out.println("더 이상 추가할수 없습니다.");
					break;
				}
				System.out.println("상품종류 책(1) 음악CD(2) 회화책(3) >> ");
				type = sin.nextInt();
				if (type < 1 || type > 3) {
					System.out.println("잘못된 상품 종류입니다.");
					break;
				}
				addProduct(type);// 상품 추가 메소드
			case 2:// 모든상품조회
				for (int i = 0; i < numberOfProduct; i++) {
					p[i].showInfo();
				}
				break;

			case 3:// 끝내기
				System.out.println("시스템을 종료합니다.");
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}// main end
//상품추가

	private static void addProduct(int type) {
		Scanner sin = new Scanner(System.in);
		System.out.print("상품설명>> ");
		String desc = sin.nextLine();

		System.out.println("생산자>> ");
		String maker = sin.nextLine();

		System.out.println("가격>>");
		int price = Integer.parseInt(sin.nextLine());// sin.nextInt();

		switch (type) {
		case 1:// 책
			System.out.println("책 제목>> ");
			String title = sin.nextLine();

			System.out.println("저자 >>");
			String author = sin.nextLine();

			System.out.println("ISBN>> ");
			int ISBN = sin.nextInt();
			p[numberOfProduct] = new Book(productID++, desc, maker, price, ISBN, title, author);
			break;
		case 2:// 음악CD
			System.out.println("앨범 제목 >> ");
			String albumTitle = sin.nextLine();

			System.out.println("가수 >> ");
			String artist = sin.nextLine();
			p[numberOfProduct] = new CompacDisc(productID++, desc, maker, price, albumTitle, artist);

			break;

		case 3:// 회화책
			System.out.println("책 제목 >> ");
			String title2 = sin.nextLine();

			System.out.println("저자 >> ");
			String author2 = sin.nextLine();

			System.out.println("언어 >> ");
			String language = sin.nextLine();

			System.out.println("ISBN >> ");
			int ISBN2 = sin.nextInt();
			p[numberOfProduct] = new ConversationBook(productID++, desc, maker, price, ISBN2, title2, author2,
					language);

			break;

		}// switch
		numberOfProduct++;//이게 없으면 p[0]에서 값이 고여있는다.
	}

}
