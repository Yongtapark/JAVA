package java221107;

import java.util.Scanner;

public class Ex09_11 {
	static void coffee_machine(int button) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 뜨거운 물을 준비한다.");
		System.out.println("2. 종이컵을 준비한다.");

		switch (button) {
		case 1:
			System.out.println("3.보통 커피를 탄다");
			break;
		case 2:
			System.out.println("3.설탕 커피를 탄다");
			break;
		case 3:
			System.out.println("3.블랙 커피를 탄다");
			break;
		}
		System.out.println("4.물을 붓는다");
		System.out.println("5.스푼으로 저어서 녹인다.");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coffee;
		int ret;
		System.out.println("어떤 커피를 드릴까요 ? 1.보통 ,2.설탕 3.블랙");
		coffee = sc.nextInt();

		coffee_machine(coffee);

		System.out.println();
		System.out.println("손님~ 커피 여기 있습니다.");

	}
}
