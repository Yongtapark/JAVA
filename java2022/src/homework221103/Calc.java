package homework221103;

public abstract class Calc {
	protected int a,b;
	//일반메소드 정의 (강제성 없음)
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	//추상메소드(구현부가 없는 메소드 정의) :자식에 꼭 재정의하라는 강제성
	public abstract int calculate();

}
