package day09;

import java.util.Scanner;
import java.util.Arrays;

public class CalenderTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int day[] = new int[] { 6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 1 };
		int mon_len[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("월>>");
		int mon = sc.nextInt();
		System.out.println("\t\t[2022년" + mon + "월]");
		System.out.println();
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("=====================================================");

//시작위치만큼 공백 처리
		for (int i = 0; i < day[mon - 1]; i++) {
			System.out.print("\t");// 시작위치만큼 공백처리
		}
		//10월을 입력 받으면 mon_len[10-1] : 마지막 달의 일수
		for(int i =1;i<mon_len[mon-1]+1;i++) {
		System.out.printf("%d\t",i);
		if((day[mon-1]+i)%7==0) {
			System.out.println();
		}
		
		}
		System.out.println();
		System.out.println("=====================================================");
	}

}
