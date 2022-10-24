package day09;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		
		System.out.print("입력 처리할 학생의 수(명): ");
		String student[]=new String[Integer.parseInt(sc.nextLine())];
		for(int i=0; i<student.length;i++) {
			System.out.print("이름 전화번호 입력("+(i+1)+")[공백구분] : ");
			student[i]=sc.nextLine();}
			System.out.println("--------------------------------");
			System.out.println("전체 학생 수 :"+student.length);
			System.out.println("--------------------------------");
			System.out.println("이름\t전화번호");
		for(int i=0; i<student.length;i++) {
			System.out.println(student[i]);
		}
		}
	}


