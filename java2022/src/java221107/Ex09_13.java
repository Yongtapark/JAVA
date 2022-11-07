package java221107;

import java.util.Scanner;
public class Ex09_13 {
	static int plus(int v1,int v2) {
		int result;
		result =v1+v2;
		return result;
	}

	public static void main(String[] args) {
		int hap;
		int v1 = 100, v2 = 200;
		Ex09_13 add =new Ex09_13();
		hap = plus(v1,v2);
		System.out.println(v1+"과"+v2+"의plus 메소드 결과는 :"+hap);
		
		
	}
}
