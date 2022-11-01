package java1028;

class Calc {
	void addValue(double V1, double V2) {
		System.out.println("doulbe값 계산 ==>" + (V1 + V2));
	}

	void addValue(int V1, int V2) {
		System.out.println("int 값 계산 ==>" + (V1 + V2));
	}
}

public class Ex11_09 {
	public static void main(String[] args) {
		Calc myCalc = new Calc();

		myCalc.addValue(1.0, 1.0);
		myCalc.addValue(1, 1);

	}

}
