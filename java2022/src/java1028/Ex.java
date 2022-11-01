package java1028;

class StaticSample2 {
	//static메소드 내에서는 static 멤버필드만 접근해야함. non-static멤버필드 접근불가
	//non-staic 메소드내에서는 static
	public int n;
	public void g() {
		m=20;
	}
	public void h() {
		m=30;
	}
	public static int m=0;
	public static void f() {
		m=5;
	}}
public class Ex{
	public static void main(String[] args) {
		//1
		StaticSample2.m=10;
		System.out.println("1.m ="+StaticSample2.m);
		
		StaticSample2 s1;
		s1=new StaticSample2();
		//2
		System.out.println("2.m = "+s1.m);//객체 만들어 전역변수 들어갔더니 0이됨;
		//s1.m 과 m은 왜 다른가??? 둘다 같은 static m인데 ??
		//오타였음ㅋ
		//3
		s1.f();
		System.out.println("3.m= "+s1.m);
		
		//4
		StaticSample.f();
		System.out.println("4.m = "+StaticSample2.m);
		

	}

}
