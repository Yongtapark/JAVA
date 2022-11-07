package java221104;

import java.util.Scanner;

public class test {
	void square() {
		Scanner sc = new Scanner(System.in);
		System.out.println("한 변 :");
		int square = sc.nextInt();
		for (int i = 0; i < square; i++) {
			System.out.println();
			for (int j = 0; j < square; j++) {
				System.out.print("*");
			}
		}
	}

	void Rectangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("변1");
		int a1 = sc.nextInt();
		System.out.println("변2");
		int a2 = sc.nextInt();
		for (int i = 0; i < a1; i++) {
			System.out.println();
			for (int j = 0; j < a2; j++) {
				System.out.print("*");
			}
		}
	}

	public static void main(String[] args) {
		test t = new test();
		 
		 t.square();
		 System.out.println();
		 t.Rectangle();

	}

}
