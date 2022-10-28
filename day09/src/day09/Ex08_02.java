package day09;

import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
//		int a,b,c,d;
//		int hap=0;
//		
//		int[] aa=new int [4];
		
		//------------------원시적 방법----------------
//		System.out.println("1번째 숫자를 입력하세요");
//		aa[0] = s.nextInt();
//		System.out.println("2번째 숫자를 입력하세요");
//		aa[1] = s.nextInt();
//		System.out.println("3번째 숫자를 입력하세요");
//		aa[2] = s.nextInt();
//		System.out.println("4번째 숫자를 입력하세요");
//		aa[3] = s.nextInt();
//		
//		hap=aa[1]+aa[0]+aa[2]+aa[3];
//		
//		System.out.println("합계"+hap);
		
//		int[] array;
//		array = new int[] {s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
//		System.out.println(array[0]);
//		
//		for(int i=0;i<array.length;i++) {
//			hap+=array[i];
//		}
//		System.out.println(hap);
		
		//int[] aa=new int [4];

		int hap=0;
		int[] aa=new int [4];
		
		for(int i=0;i<aa.length;i++) {
			System.out.println(i+"번째 숫자를 입력해주세요");
			aa[i]=s.nextInt();
			hap+=aa[i];
		}
		System.out.println(hap);
		
		
		
		//System.out.println(hap);
	}

}
