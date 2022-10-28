package day09;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int sum=0, avg=0;
		System.out.print("학생 수 입력 : ");
		int studentScore[]=new int[sc.nextInt()];
		int k=0;
		for(int i:studentScore) {//i = studentScore[0]..studentScore[4]
			System.out.print(k+1+"번 학생 점수 입력 :");
			studentScore[k]=sc.nextInt();
			sum += studentScore[k];
			k++;
		}
		avg=(sum/studentScore.length);
		System.out.println("합 : "+sum);
		System.out.println("평균 :"+avg);
		System.out.println("편차");
		System.out.println("------------------");
		
		for(int student:studentScore) {
			System.out.println(studentScore[k]+" : "+(avg-studentScore[k]));
			k++;
		}
	}

}
