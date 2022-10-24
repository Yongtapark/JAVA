package day09;

import java.util.Scanner;
import java.util.Arrays;
public class CalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("알고자 하는 월을 입력하세요");
		int mon=sc.nextInt();
		
		//1(6,31일)2(2,28일)3(2,31일)4(5,30일)5(0,31일)6(3,30일)
		//7(5,31일)8(1,31일)9(4,30일)10(6,31일)11(2,30일)12(1,31일)
		
		//int monthDay[]=new int[31];
		//String week[]=new String[]{"일","월","화","수","목","금","토"};
		int monthSt[]=new int[] {6,2,2,5,0,3,5,1,4,6,2,1};
		int monthLt[]=new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int day[]=new int[monthLt[mon-1]];
		for(int i=0;i<day.length;i++) {
			day[i]=i+1;
		}
//		System.out.println(Arrays.toString(day));
//		System.out.println(monthLt[mon - 1] + monthSt[mon - 1]);
		int a = 0;
		for (int i = 0; i <= monthLt[mon - 1] + monthSt[mon - 1]; i++) {// 달 시작 배열
			// monthDay[i]+=i;
			if (i < monthSt[mon - 1]) {
				System.out.print("\t");

			} else {
			if(a == monthLt[mon - 1]) {break;}
			if (i % 8 == 0) {
				System.out.println();
			} else {
				System.out.print(day[a] + "\t");
				a++;
			}
			}

		}
				
	}

}
