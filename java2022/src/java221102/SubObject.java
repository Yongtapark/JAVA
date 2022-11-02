package java221102;

class SuperObject {
	protected String name;

	public void Paint() {
		draw();
	}

	public void draw() {
		System.out.println(name);
	}
}

public class SubObject extends SuperObject {
	protected String name; // 필드의 재정의 // 재정의를 하지않고 super.name을 지우면 sub가 2번 나온다.

	@Override
	public void draw() {// 메소드 재정의, 동적바인딩
		name = "Sub";// ==this.name=="sub"
		super.name = "Super";// 부모객체.필드 =값 저장
		super.draw();// 부모 메소드 호출
		System.out.println(name);
	}

	public static void main(String[] args) {
		SuperObject b = new SubObject();// 업캐스팅
		b.Paint();

	}

}
