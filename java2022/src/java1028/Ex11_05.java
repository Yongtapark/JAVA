package java1028;

class Far {
	private int speed = 0;
	int left;
	int right;
	//생성자의 Overroading==메소드 중복
	//메소명의 왼쪽x, 오른쪽(모두 달라야 한다. 타입,갯수,순서,기능의 다양성)
	//디폴트 생성자 정의하고 초기화->left;right
	public Far() {
		//모든 객체에 디폴드 생성자를 호출하면 모든객체들의 멤버값이 같다.
		left=20;
		right=30;
	}

	public Far(int speed, int left, int right) {
		this.speed=speed;
		this.left=left;
		this.right=right;
	}

	public Far(int speed, int left) {
		this.speed=speed;
		this.left=left;
	}

	public void upSpeed(int value) {
		if (speed + value > 200) {
			speed = 200;
		} else {
			speed += value;
		}
		System.out.println("현재속도 ==>" + getSpeed());
	}

	public void downSpeed(int value) {
		if (speed - value < 0) {
			speed = 0;
		} else {
			speed -= value;
		}
		System.out.println("현재속도 ==>" + getSpeed());
	}

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
}

public class Ex11_05 {
	public static void main(String[] args) {
		Far myCar1 = new Far();
		//myCar1.setSpeed(-110);
		myCar1.upSpeed(100);
		myCar1.upSpeed(150);

		myCar1.downSpeed(50);
		myCar1.downSpeed(160);
		Far myCar4=new Far(300,2,3);
		Far myCar5=new Far(300,2);
		System.out.println(myCar4.left);
		
	}
}
