package day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalenderTest4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 서기 1년1월1일 =월요일 년도가 4의 배수이고 100의 배수가 아니거나 400의 배수이면 2월은 29일(윤년) 나머지는 2월은
		 * 28일(평년)
		 * 
		 * 2022년 10월 달력을 그린다고 가정하면 1.1.1~2022.9.30(마지막날)까지의 전체 일수를 구한다. 그 일 수에 +1연산을
		 * 수행하면(요일 확인) 10월 달력이 된다.
		 * 
		 * 요일 = 전체일수%7 요일=0=>일요일 .....6=>토요일 출력) 년도를 입력하세요 :2022 월을 입력하세요 :10
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// 12달 중에서 각 달에 마지막을 일을 배열에 초기값을 설정해 주세요.
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int y, m, w, ilsu;// 년,월 요일,일수

		do {// 년도
			System.out.print("년도를 입력하세요.");
			y = Integer.parseInt(bf.readLine());
		} while (y < 1);

		do {// 한번만 입력월받는 월
			System.out.println("월을 입력하세요.");
			m = Integer.parseInt(bf.readLine());
		} while (m < 1 || m > 12);// 0~11사이 숫자입력

		// 1년 1월 1일~입력받은 년도 직전년도의 12월 13일까지의 일수를 계산
		// 년도/4 and 년도/100or 년도/400
		ilsu = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;

		// 입력받은 년도 2월의 마지막 일 계산
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
			days[1] = 29;// 윤달

			// 해당 년도 1월부터 입력받은 월 이전의 월의 마지막 날짜깢의 일 수 누적 연산
			for (int i = 0; i < (m - 1); i++) {
				ilsu += days[i];
			}
			ilsu += 1;
		}
		// ------------------------------------------------------모든 일수 계산 끝
		// 요일 계산
		// 입력받은 월의 1일이 무슨 요일인지 확인하기 위한 연산
		w = ilsu % 7;// 0:일요일,1:울요일~6:토요일

		// 달력 출력하기
		System.out.println();
		System.out.println("\t[" + y + "년" + m + "월]\n");
		System.out.println();
		System.out.println("  일   월   화   수   목   금   토");
		System.out.println("=============================");

		for (int i = 1; i <= w; i++) {
			System.out.print("    ");// 4칸공백
		}
		for (int i = 1; i < days[m - 1]; i++) {
			System.out.printf("%4d", i);
			w++;// 날짜가 증가하는 만큼 요일이 함께 증가

			// 일요일 출력할때마다 줄 바꿈하고 출력 할 수 있도록 처리
			if (w % 7 == 0)
				System.out.println();
		} // for

		// 달의 마지막 날짜가 출력 형식을 모두 채웠을 경우
		// 이미 일요일 개행이 이루어졌기 때문에 이 경우는 개행을 하지 않도록 처리
		if (w % 7 != 0) {
			System.out.println();
		}
		System.out.println("=============================");

	}
}
