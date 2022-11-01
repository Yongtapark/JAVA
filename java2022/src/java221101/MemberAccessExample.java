package java221101;

public class MemberAccessExample {

	public static void main(String[] args) {
		A1 a= new A1();
		B1 b= new B1();
		//b.m=5;
		b.setM(5);
		
		
		a.p=5;
		//a.n=5; //n은 private 멤버,컴파일 오류
		
		b.p=5;
		//b.n=5;//n은 private 멤버,컴파일 오류
		
		b.setN(10); 
		int i=b.getN(); // i는 10
		
		//b.m =20;//m은 private 멤버, 컴파일 오류
		b.setM(20);
		System.out.println(b.toString());
		System.out.println(b.p);
		System.out.println(b.getN());
		//화면에 10 20 출력

	}

}
