package java1027;

import java.util.Iterator;

//3.리턴타입이 있고 매개변수가 없는 메소드
//call by address
public class Mathod_Add_메소드호출3 {

	public static void main(String[] args) {
		int[]b={};//배열 초기화
		
		b=add();
		for (int i=0; i<b.length;i++) {
			System.out.println(b[i]);
		}
}//main
	public static int[] add() {
		int[] a = { 1, 2, 3 };
		return a;
	}
	}
