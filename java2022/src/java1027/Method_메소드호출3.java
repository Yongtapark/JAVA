package java1027;
//3.리턴타입이 있고,매개변수가 없는 메소드
public class Method_메소드호출3 {

	public static void main(String[] args) {
		Method_메소드호출3 aa = new Method_메소드호출3();
		// 사칙연산(메소드를 호출해서 연산)

		int a = 30, b = 10;
		// + 호출해서 출력하고 돌아오기
		int result=aa.add();// 호출
System.out.println("받아온 값"+result);
		// 빼기
		int result2=aa.mina();
		System.out.println("result2="+result2);
		// 곱하기
		int result3=aa.gob();
		System.out.println("result3="+result3);
		// 나누기
		int result4=aa.nanu();
		System.out.println("result4="+result4);
	}

	public int add() {
		return 10;
		
	}

	public int mina() {
		
		return 10;
	}

	public int gob() {
		
		return 10;
	}

	public int nanu() {
		
		return 10;
	}
}
