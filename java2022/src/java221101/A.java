package java221101;

public class A {
	A a1=new A(true);
	A a2=new A(1);
	A a3=new A("문자열");
	
	//생성자
	public A(boolean b) {}	//public 접근제한
	A(int b){}				//default 접근제한
	private A(String s) {}	//private 접근제한
	
	//객체 만들어서 c클래스에서 getter()호출하여 객체 넘겨주기
	private static A a=new A("문자열");
	
	public static A getInstance(String string) {
		return a ;
	}
}
