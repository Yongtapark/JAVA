package day09;

import java.util.Random;
import java.util.Scanner;

public class EnglishEdu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		String[] month = new String[] { "january", "february", "march", "april", "may", "jun", "july", "august",
//				"september", "october", "november", "december" };
//		Random rd = new Random();
//		while (true) {
//			int i = (int) ((rd.nextInt(12)));
//			String question = month[i];// 지렸다..-----------------------
//			System.out.println("문제는 " + question);
//			System.out.println("몇 월입니까 ? :");
//			int monAnswer = sc.nextInt();																
//																									
//			if (i == monAnswer - 1) {// monAnswer-1과 같은 번호의 배열의 번호가 같을때 정답 //배열 번호를 구하는법을 모르겠다.==>16번줄 보세요
//				System.out.println("정답입니다.");
//			} else {
//				System.out.println("오답입니다.");
//			}
//		}
//강사님 답안-----------------------------------------------------------------------

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		String[] monthString = { "january", "february", "march", "april", "may", "jun", "july", "august", "september",
				"october", "november", "december" };
		while (true) {
			int month = rand.nextInt(12);// 0~11
			System.out.println("문제는" + monthString[month]);
			while (true) {
				System.out.println("몇 월 입니까? :");
				int m = sc.nextInt();
				if (m == month + 1)
					break;
				System.out.println("아닙니다.");
			}
			System.out.println("정답입니다.");
		}
	}

}
