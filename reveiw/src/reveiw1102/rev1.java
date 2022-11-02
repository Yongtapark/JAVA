package reveiw1102;
class SuperObject{
	protected String name;
	void Paint() {
		draw();
	}
	void draw() {
		System.out.println(name);
	}
}


public class rev1 extends SuperObject{
	protected String name;
	@Override
	void draw() {
		name ="sub";
		System.out.println(name);
		super.name="super";
		super.draw();
		
	}
	
	public static void main(String[] args) {
		SuperObject b=new rev1();
		b.Paint();

	}

}
