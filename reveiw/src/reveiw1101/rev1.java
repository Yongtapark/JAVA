package reveiw1101;

class A {
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("���ڿ�");
	
	//������
	public A(boolean b) {}
	A(int b){}
	private A(String s) {}
	
	private static A a =new A("���ڿ�");
	
	public static A getInstance(String string) {
		return a;
	}
}

 class B{
	A a1=new A(true);
	A a2=new A(1);
	
}

public class rev1 {
	A a1= new A(true);
	A a2=new A(1);
	A a4= A.getInstance("���ڿ�");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
