package java221101;

class DObject {
	public DObject next;

	public DObject() {
		next = null;
	}

	public void draw() {
		System.out.println("DObject draw");
	}
}

class Line extends DObject {
	public void draw() {// 메소드 오버라이딩
		System.out.println("Line");
	}
}
class Rect extends DObject{
	public void draw() {//메소드 오버라이딩
		System.out.println("Rect");
	}
}
class Circle extends DObject{
	public void draw() {//메소드 오버라이딩
		System.out.println("Circle");
	}
}
public class MethodOverringEx {

	public static void main(String[] args) {
		DObject obj=new DObject();
		Line line =new Line();
		DObject p = new Line();
		DObject r = line;
		
		obj.draw();//DObject.draw() 메소드 실행."DObject draw"출력
		line.draw();//Line.draw()메소드 실행, "Line" 출력
		p.draw();//오버라이딩된 메소드 Line.draw()실행,"Line"출력
		r.draw();//오버라이딩된 메소드 Line.draw()실행,"Line"출력
		
		DObject rect =new Rect();//업캐스팅
		DObject Circle =new Circle();//업캐스팅
		//다운캐스팅
		Rect cc=(Rect)rect;
		Circle c=(Circle)Circle;
		
		rect.draw();
		Circle.draw();
		cc.draw();
		c.draw();
		
		

	}

}
