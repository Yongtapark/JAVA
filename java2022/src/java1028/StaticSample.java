package java1028;

public class StaticSample {
	public int n;
	public void g() {
		m=20;
	}
	public void h() {
		m=30;
	}
	public static int m;
	public static void f() {
		m=5;
	}
	public static void main(String[] args) {
		StaticSample s1,s2;
		s1= new StaticSample();
		//1
		s1.n=5;
		s1.g();
		System.out.println("1.n = "+s1.n);
		System.out.println("1.m ="+m);
		//2
		s1.m=50;
		System.out.println("2.m = "+m);
		
		s2=new StaticSample();
		//3
		s2.n=8;
		s2.h();
		System.out.println("3.n = "+s2.n);
		System.out.println("3.m = "+m);
		//4
		s2.f();
		System.out.println("4.m = "+s1.m);
		

	}

}
