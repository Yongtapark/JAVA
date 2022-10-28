package java1027;

import java.util.Iterator;

//4.리턴타입이 없고 매개변수가 있는 메소드 호출
//call by address
public class Mathod_Add_메소드호출4 {

	public static void main(String[] args) {
		int[]b={1,2,3};//배열 초기화
		
		add(b);
		Mathod_Add_메소드호출4 m =new Mathod_Add_메소드호출4();
		//add(m);
		//Mathod_Add_메소드호출4=add(m);
};//main
// 			Mathod_Add_메소드호출4
	public static void add(int []b) {//add(Mathod_Add_메소드호출4 b)
		for (int i=0; i<b.length;i++) {
			System.out.println(b[i]);
		}
		//return b;
	}
	}
