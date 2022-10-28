package day09;

import java.util.Scanner;

public class ArrayAvg {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		// TODO Auto-generated method stub
//		System.out.println("5명의 점수를 입력하세요");
//		int score[]=new int[5];
//		int sum=0;
//		
//		for(int i=0;i<score.length;i++) {
//			System.out.print(i+1+"번의 점수 :");
//			score[i]=sc.nextInt();
//			sum+=score[i];
//		}
//		double avg=sum/score.length;
//		System.out.println("합계는"+sum+"점 입니다.");
//		System.out.println("합계는"+avg+"점 입니다.");
		
		//강사님 답안
		
		int sum=0;//합계
		final int person=5;//고정상수
		int[]point=new int[person];
		System.out.println(person+"명의 점수를 구하시오");
		for(int i=0;i<person;i++) {
			System.out.println((i+1)+"번의 점수 :");
			point[i]=sc.nextInt();
			sum+= point[i];
		}
		System.out.println("합계는 "+sum+"점입니다.");
		System.out.println("평균은 "+(double)sum/person+"점입니다.");
	}

}
