package java221101;

public class Car {
	
	//필드
	private int speed;
	private boolean stop;
	//생성자
	
	//메소드
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed<0) {
			System.out.println("속도입력이 잘못되었습니다. 작동을 중지합니다.");
			this.speed =0;
			return;
		}else {
			System.out.println("속도를 올립니다.");
			this.speed=speed;
		
		}
	}
	public boolean isStop() {
		System.out.println("작동을 중지합니다.");
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop= stop;
		this.speed=0;
	}
}
