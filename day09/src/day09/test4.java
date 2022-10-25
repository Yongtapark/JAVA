package day09;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		
//		System.out.print("입력 처리할 학생의 수(명): ");
//		String student[]=new String[Integer.parseInt(sc.nextLine())];
//		for(int i=0; i<student.length;i++) {
//			System.out.print("이름 전화번호 입력("+(i+1)+")[공백구분] : ");
//			student[i]=sc.nextLine();}
//			System.out.println("--------------------------------");
//			System.out.println("전체 학생 수 :"+student.length);
//			System.out.println("--------------------------------");
//			System.out.println("이름\t전화번호");
//		for(int i=0; i<student.length;i++) {
//			System.out.println(student[i]);
//		}
		
		//-------------------------------------------------------------
		
		int n;
		System.out.print("입력 처리할 학생 수(명) :");
		n=sc.nextInt();
		
		String[] name=new String[n]; //학생 이름을 담아낼 변수
		String[] phon = new String[n]; //전화번호를 담아낼 변수
		//이름과 번호의 배열을 따로 나누어 만들었다.
		
		for(int i=0; i<name.length; i++) {
			System.out.print("이름 전화번호 입력("+(i+1)+")[공백구분] :");
			name[i]=sc.next();
			phon[i]=sc.next();
		}
		
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("전체 학생 수 : "+n+" 명");
		System.out.println("-----------------------------");
		System.out.println("이름    전화번호 ");
		
		for(int i= 0; i<name.length; i++) {
			System.out.println(name[i]+"     "+phon[i]);
		
		}
		System.out.println("-----------------------------");
		}
	}


