package java221107;
class myInt{
	int a;
}//call by address
public class Ex09_18 {

static void func1(myInt m) {//타입 중요
	m.a=m.a+1;
	System.out.println("전달받은 a==>"+m.a);
}
	public static void main(String[] args) {
		myInt m= new myInt();
		m.a =10;
		func1(m);//주소전달
		System.out.println("func1() 실행 후의 a==>"+m.a);

	}

}
