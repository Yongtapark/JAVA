package java1028;
class Sample{
	public int a;
	private int b;
	int c;

	public void setB(int b) {
		this.b=b;
	}
	public int getB() {
		return b;
	}
}
	public class AccessEX {


	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a=10;
		//aClass.b=10; //외부 클래스에 있는 private 접근지정자의 변수 호출 해서 에러
		//직접접근 불가
		aClass.setB(10);//간접처리방법
		aClass.c=10;
		
		System.out.println("a="+aClass.a);
		System.out.println("a="+aClass. getB());
		System.out.println("a="+aClass.c);

	}

}
