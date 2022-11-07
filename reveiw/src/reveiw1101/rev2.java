package reveiw1101;
class Point{
	int x=3,y=5;
	void set(int x, int y) {
		this.x= x;
		this.y=y;
	}
	void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point{
	String color="red";
	void setColor(String c) {
		this.color=color;
	}
	
	void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
public class rev2 {

	public static void main(String[] args) {
		ColorPoint cp= new ColorPoint();
//		cp.set(3,4);
//		cp.setColor("red");
		cp.showColorPoint();

	}

}
