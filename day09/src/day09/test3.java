package day09;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 데이터 갯수 :");
		int test[] = new int[sc.nextInt()];
		
		System.out.print("데이터 입력[공백구분] : ");
		for (i = 0; i < test.length; i++) {
			test[i] = sc.nextInt();
			if (max < test[i]) {
				max = test[i];
			}
		}
		System.out.println("가장 큰 수 ==>" + max);

	}

}
