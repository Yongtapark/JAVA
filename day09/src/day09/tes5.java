package day09;

import java.util.Scanner;

public class tes5 {

	public static void main(String[] args) {
		// int fo3m1[]= {1,2,3,4,5,7};
		// int fo3m2[]=new int[] {100,200,300};
		// int form3[];
		// form3=new int[3];
		// form3[0]=100;
		// form3[1]=200;
		// form3[3]=300;
		//
		// int form4[]= new int[4];
		// form4[0]=100;
		// form4[1]=200;
		// form4[2]=300;
		// form4[3]=400;
		//
		// int cc[]=new int[] {100,200};
		// int dd[]=new int[1];
		// dd[0]=100;
		//
		//

		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;

		for (int i = 0; i < intArray.length; i++) {

			System.out.println("intArray[" + i + "]=" + intArray[i]);
		}
		System.out.println("5개의 숫자를 입력하시요");

		for (int i = 0; i < intArray.length;i++) {
			intArray[i] = sc.nextInt();
			System.out.println("intArray["+i+"]="+intArray[i]);
			if (intArray[i] > max) {
				max = intArray[i];
				
			}
			System.out.println("max=" + max);
		}
	}

}
