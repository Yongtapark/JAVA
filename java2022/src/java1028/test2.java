package java1028;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 :");
		int array = sc.nextInt();
		int a[][] = new int[array][(int)(Math.random()*10)+1];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=(int)(Math.random()*10)+1;
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
