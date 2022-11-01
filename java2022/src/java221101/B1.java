package java221101;

public class B1 extends A1 {
	private int m;

	public void setM(int m) {
		this.m = m;
	}

	public int getM() {
		return m;
	}

//	public String toString() {
//		String s = getN() + " " + getM();
//		return s;
//
//	}

	@Override
	public String toString() {
		String s = getN() + " " + getM();
		return s;

	}

	public static void main(String[] args) {
		A1 a = new A1();
		B1 b = new B1();
		b.m = 5;
		b.setN(11);
		System.out.println(b.getN());// 10
		System.out.println(a);// n=0
		System.out.println(a.toString());
		System.out.println(b);// 10 5
		System.out.println(b.toString());// 10 5
	}
}
