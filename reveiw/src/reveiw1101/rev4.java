package reveiw1101;
class A1{
	A1(){
		System.out.println("������a");
	}
}

class B1 extends A1{
	B1(){
		System.out.println("������B");
	}
}
class C1 extends B1{
	C1(){
		System.out.println("������C");
	}
}
public class rev4 {

	public static void main(String[] args) {
		C1 c;
		c= new C1();
		

	}

}
