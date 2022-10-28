package day09;

public class Ex08_04 {
	public static void main(String[]args) {
		int aa[]= {100,200,300,400};//---배열 선언과 동시에 직접 초깃값을 대입한다.
		int bb[]=new int[]{100,200,300};//---배열 선언과 동시에 new 연산자와 함께 초깃값으 대입
		//선언
//		int aa[];
//		//메모리 생성 4개
//		aa=new int[4];
//		//초기화
//		aa[0]=100;
//		aa[1]=200;
//		aa[3]=300;
//		aa[4]=400;
		//int aa[] = new int[5];//선언, 메모리 생성, 디폴트값
		//초기화
		/*
		  aa[0]=100; 
		  aa[1]=200; 
		  aa[3]=300; 
		  aa[4]=400;
		 */
		
		int cc[]; // 배열 선언 후 초깃값을 대입
		cc=new int[] {100,200};
		int[] dd=new int[1]; //배열 선언과 동시에 크기를 결정한 후 초깃값을 대입
		dd[0]= 100;
		int i;
		for(i=0;i<aa.length;i++) 
			System.out.printf("aa[%d]==>%d\t",i,aa[i]);
		System.out.println();
		for(i=0;i<bb.length;i++) 
			System.out.printf("bb[%d]==>%d\t",i,bb[i]);
		System.out.println();
		for(i=0;i<cc.length;i++) 
			System.out.printf("cc[%d]==>%d\t",i,cc[i]);
		System.out.println();
		for(i=0;i<dd.length;i++) 
			System.out.printf("dd[%d]==>%d\t",i,dd[i]);
		System.out.println();
}}