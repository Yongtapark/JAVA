package java221101;
//자식 클래스 extends 부모클래스
public class ColorPoint extends Point {//클래스는 단일 상속만 가능
	// 다중상속은 인터페이스로만 가능/ 자식클래스 implements 부모인터페이스, 부모인터페이스...
	//Point를 상속받은 ColorPoint 선언
	String color;//점의 색
	void setColor(String color) {
		this.color=color;
	}
	
	void showColorPoint() {//컬러 점의 좌표 출력
		System.out.print(color);
		showPoint();//Point 클래스의 showPoint() 호출
	}
	
	
	
	public static void main(String[] args) {
		ColorPoint cp= new ColorPoint();
		cp.set(3, 4); //Point 클래스의 set() 메소드 호출
		cp.setColor("Red");
		cp.showColorPoint();

	}

}
