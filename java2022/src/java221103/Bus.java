package java221103;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 굴러갑니다.");
	}
	
	void check() {
		System.err.println("승차요금을 확인합니다.");
	}

}
