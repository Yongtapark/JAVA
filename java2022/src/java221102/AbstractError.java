package java221102;

abstract class Dobject {// 추상 클래스 선언
	public Dobject next;

	public Dobject() {
		next = null;
	}

	abstract public void draw();// 추상 메소드 선언
}

public class AbstractError extends Dobject {
	public static void main(String[] args) {
		Dobject obj;
		//obj = new Dobject();// 컴파일 오류, 추상클래스 DObject의 인스턴스 생성 불가
		//obj.draw();// 컴파일 오류
		AbstractError a= new AbstractError();
		
	}

	@Override
	public void draw() {
		// {}이라도 추가하여 오버라이드 해야 확장이 된다.
		
	}

}
