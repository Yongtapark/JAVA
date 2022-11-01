package java221101;

class A2 {
	public A2(int x) {
		System.out.println("매개변수 생성자A"+x);
	}
	public A2(){
		this(2);
		System.out.println("생성자A");
	}
}

class B2 extends A2 {
	public B2(int x) {
		this();
		System.out.println("매개변수 생성자B"+x);
	}
	public B2(){
		System.out.println("생성자B");
	}
}

class C2 extends B2 {
	public C2(int x) {
		super(2);
		System.out.println("매개변수 생성자C"+x);
	}
}

public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 c;//요거 무엇 아. 선언.
		c= new C2(5);

	}

}
