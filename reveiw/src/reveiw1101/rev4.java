package reveiw1101;
class A1{
	A1(){
		System.out.println("持失切a");
	}
}

class B1 extends A1{
	B1(){
		System.out.println("持失切B");
	}
}
class C1 extends B1{
	C1(){
		System.out.println("持失切C");
	}
}
public class rev4 {

	public static void main(String[] args) {
		C1 c;
		c= new C1();
		

	}

}
