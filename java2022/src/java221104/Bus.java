package java221104;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 굴러갑니다.");
		
	}
	
	public void  checkFare() {
		System.out.println("승차요금을 확인합니다.");
	}
}
