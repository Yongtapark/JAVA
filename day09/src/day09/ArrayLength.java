package day09;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		
		//1) 선언 메모리 할당 디폴트초기화
		int intArray[] =new int[5];
		
		//2)int inArray[];//선언
		//intArray=new int[5];//메모리할당 디폴트초기화
		//intArray[0]=20;//초기화
		
		//3)선언 메모리할당 초기화
		//	int intArray[]={10,20,30,40,50};
		
		//4)선언, 메모리할당과 초기화
		// int intArray[];
		//intArray=new int[]{10,20,30,40,50};
		double sum=0;
		int min=10;
		
		for(int i=0;i<intArray.length;i++) {
			intArray[i]=in.nextInt();
		}
		
		for(int i= 0;i<intArray.length;i++) {
			sum+=intArray[i];
			if(min>intArray[i]) {
				min=intArray[i];
				System.out.println(min);
			}
			//System.out.println(i+"번배열까지합="+sum);
		}System.out.println("배열 원소의 평균은"+sum/intArray.length+"입니다.");
		System.out.println("최소값은"+min+"입니다.");
	}

}
