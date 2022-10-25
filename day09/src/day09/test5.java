package day09;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int sum=0, avg=0;
		System.out.print("학생 수 입력 : ");
		int studentScore[]=new int[sc.nextInt()];
		for(int i=0;i<studentScore.length;i++) {
			System.out.print(i+1+"번 학생 점수 입력 :");
			studentScore[i]=sc.nextInt();
			sum += studentScore[i];
			
		}
		avg=(sum/studentScore.length);
		System.out.println("합 : "+sum);
		System.out.println("평균 :"+avg);
		System.out.println("편차");
		System.out.println("------------------");
		
		for(int i =0; i<studentScore.length;i++) {
			System.out.println(studentScore[i]+" : "+(avg-studentScore[i]));
		}
	}

}
