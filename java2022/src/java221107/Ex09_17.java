package java221107;

public class Ex09_17 {

	static int func1(int a) {
		a= a+1;
		System.out.println("전달받은 a==>"+a);
		return a;
	}
	public static void main(String[] args) {
		int a=10;
		func1(a);
		System.out.println("func1() 실행 후의 a==>"+a);

	}

}
