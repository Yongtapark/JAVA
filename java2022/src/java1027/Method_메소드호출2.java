package java1027;
//2.리턴있고 매개변수도 있음
public class Method_메소드호출2 {

	public static void main(String[] args) {
		Method_메소드호출2 aa = new Method_메소드호출2();
		// 사칙연산(메소드를 호출해서 연산)

		int a = 30, b = 10;
		// + 호출해서 출력하고 돌아오기
		int result=aa.add(a, b);// 호출
System.out.println("result="+result);
		// 빼기
		int result2=aa.mina(a, b);
		System.out.println("result2="+result2);
		// 곱하기
		int result3=aa.gob(a, b);
		System.out.println("result3="+result3);
		// 나누기
		int result4=aa.nanu(a, b);
		System.out.println("result4="+result4);
	}

	public int add(int a, int b) {
		System.out.printf("%d+%d=%d\n", a, b, a + b);
		return a+b;
		
	}

	public int mina(int a, int b) {
		System.out.printf("%d-%d=%d\n", a, b, a - b);
		return a-b;
	}

	public int gob(int a, int b) {
		System.out.printf("%d*%d=%d\n", a, b, a * b);
		return a*b;
	}

	public int nanu(int a, int b) {
		System.out.printf("%d/%d=%d\n", a, b, a / b);
		return a/b;
	}
}
