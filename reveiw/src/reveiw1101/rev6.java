package reveiw1101;

import javax.security.auth.Subject;

class SuperObject{
	protected String name;
	
	void paint() {
		draw();
	}
	void draw() {
		System.out.println("super");
	}
}

public class rev6 extends SuperObject {
	public void draw() {
		System.out.println("sub");
	}
	
	public static void main(String[] args) {
		SuperObject b= new rev6();//업캐스팅
		b.draw();

	}

}
