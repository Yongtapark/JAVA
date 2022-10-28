package java1027;
//1.리턴이 없고 매개변수가 있음
public class Method_메소드호출1 {

	public static void main(String[] args) {
		Method_메소드호출1 aa = new Method_메소드호출1();
		// 사칙연산(메소드를 호출해서 연산)

		int a = 30, b = 10;
		// + 호출해서 출력하고 돌아오기
		aa.add(a, b);// 호출

		// 빼기
		aa.mina(a, b);
		// 곱하기
		aa.gob(a, b);
		// 나누기
		aa.nanu(a, b);
	}

	public void add(int a, int b) {
		System.out.printf("%d+%d=%d\n", a, b, a + b);
	}

	public void mina(int a, int b) {
		System.out.printf("%d-%d=%d\n", a, b, a - b);
	}

	public void gob(int a, int b) {
		System.out.printf("%d*%d=%d\n", a, b, a * b);
	}

	public void nanu(int a, int b) {
		System.out.printf("%d/%d=%d\n", a, b, a / b);
	}
}
