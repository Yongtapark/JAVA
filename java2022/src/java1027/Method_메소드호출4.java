package java1027;
//4.리턴타입이 없고,매개변수가 없는 메소드

public class Method_메소드호출4 {

	public static void main(String[] args) {
		Method_메소드호출4 aa = new Method_메소드호출4();
		// 사칙연산(메소드를 호출해서 연산)

		int a = 30, b = 10;
		// + 호출해서 출력하고 돌아오기
		aa.add();// 호출

		// 빼기
		aa.mina();
		
		// 곱하기
		aa.gob();
		
		// 나누기
		aa.nanu();
		
	}

	public void add() {
		System.out.println("더하기 출력해보기");
	}

	public void mina() {
		System.out.println("빼기 출력해보기");
	}

	public void gob() {
		System.out.println("곱하기 출력해보기");
	}

	public void nanu() {
		System.out.println("나누기 출력해보기");

	}
}
