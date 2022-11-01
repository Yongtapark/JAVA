package java221101;

class SuperObject {
	protected String name;

	public void paint() {
		draw();
	}

	public void draw() {
		System.out.println("super Object");
	}
}

public class SubObject extends SuperObject {
		
	public void draw() {//동적바인딩
		//super.draw();
		System.out.println("sub object");
	}

	public static void main(String[] args) {
		SuperObject b = new SubObject();//업캐스팅
		b.paint();

	}

}
