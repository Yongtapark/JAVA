package java221104;

import java.util.Scanner;

public class EX09_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 입력 :");
		String str=sc.nextLine();
		System.out.print("출력문자열 : ");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='o')
				System.out.printf("%c",'$');
			else
				System.out.printf("%c",str.charAt(i));
		}

	}

}
