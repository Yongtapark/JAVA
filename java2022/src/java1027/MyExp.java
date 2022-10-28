package java1027;

public class MyExp {
	int base;
	int exp;
	
	public void setBase(int Base) {
		this.base=base;
	}public void setExp(int Exp) {
		this.exp=exp;
	}

	int getValue() {
		int res = 1;
		for (int i = 0; i < exp; i++) {
			res = res * base;

		}
		return res;
	}


	public static void main(String[] args) {
		MyExp number1 = new MyExp();
		//멤버초기화
		number1.base = 2;
		number1.exp = 3;
		//setter()로 세팅하기
		number1.setBase(2);
		number1.setExp(3);
		
		MyExp number2 = new MyExp();
		//멤버초기화
		number2.base = 3;
		number2.exp = 4;
		
		//setter()로 세팅하기
		number2.setBase(3);
		number2.setExp(4);

		System.out.println("2의 3승 =" + number1.getValue());
		System.out.println("3의 4승 =" + number2.getValue());
		
		
	}
}
