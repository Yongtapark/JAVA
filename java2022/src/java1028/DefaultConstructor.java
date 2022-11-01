package java1028;

public class DefaultConstructor {
	int x;
	public DefaultConstructor() {
		System.out.println("기본 생성자");
	}//상속관계에서 디폴트생성자는 상속x
	
	public DefaultConstructor(int x) {
		//super();//부모객체의 생성자를 호출
		this.x = x;
		System.out.println("인자가 있는 생성자");
	}
	
	
	
	//마우스 오른클릭 =>source => generate getters and seeter
		//ctrl +alt +s 
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public static void main(String[] args) {
		//클래스 : 객체를 생성하기 위한 설계도 또는 틀
		//객체 : 설계도 또는 틀로 찍어낸 실체 = 메모리
		// 생성자 : 객체가 생성될 때 초기화를 위해 실행되는 메소드
	
		//인자값이 있는 생성자를 호출하면 디폴트 생성자를 jvm이 자동으로 넣어주지 않는다.
		DefaultConstructor p1=new DefaultConstructor(3);
		int n=p1.getX();
		//자동으로 넣어주지 않기 때문에 반드시 디폴트 생성자를 선언해주어야 한다.
		DefaultConstructor p2=new DefaultConstructor();
		p2.setX(5);

	}

}
