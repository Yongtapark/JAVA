package reveiw1103;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달려갑니다.");
		
	}
	
	void checkFare(){
		System.out.println("승차요급을 체크합니다.");
	}

}
