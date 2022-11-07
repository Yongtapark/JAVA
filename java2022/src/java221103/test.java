package java221103;

import java.util.Scanner;

public class test {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("인원 수 입력 :");
	int studentPer = Integer.parseInt(sc.nextLine());
	
	int []studentArray= {studentPer};
	
	
	
	for(int i=0;i<studentArray.length;i++) {
		System.out.println(i+1+"번째 학생의 학번 이름 입력(공백구분)");
		String studentData=sc.nextLine();
		System.out.println("국어 영어 수학 점수 입력(공백구분)");
		int studentScore=Integer.parseInt(sc.nextLine());
		}
	}
	
	
}

