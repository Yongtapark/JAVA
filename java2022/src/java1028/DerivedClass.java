package java1028;
//1. 클래스에 붙을 때 : 상속불가
//2. 메소드에 붙을 때 : 재정의 불가(Overriding 불가)
//3. 필드에 붙을 때 : 재할당(재저장,초기값 저장)불가
//도대체 필드란 무엇인고...
//final 
class FinalClass{
	final static int p=3;
	void get() {
		
	}
}
public class DerivedClass extends FinalClass{
@Override//컴파일러가 이해하는 주석
void get() {
	System.out.println("부모가 가진 메소드를 재정의 했어.");
}
	public static void main(String[] args) {
		final int i=0;
		//i=4;
		//p=4;재할당 불가

	}

}
