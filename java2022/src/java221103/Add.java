package java221103;

public class Add extends Calc{

	@Override
	public int calculate() {
		return a+b;
	}
}

class Substract extends Calc{
	public int calculate() {
		return a-b;
	}
}
class Mul extends Calc{
	public int calculate() {
		return a*b;
	}
}
class Div extends Calc{
	public int calculate() {
		return a/b;
	}
}
