package CarExample;

public class CarExample {
	public static void main(String[] args) {
		Car car =new Car();
		
		for(int i=1; i<=10; i++) { //Car 객체의 run() 메소드 5번 반복실행
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 한국타이어로 교체");
				car.frontLeftTire =new HankookTire("앞왼쪽",15);
			case 2:
				System.out.println("앞오른쪽 금호타이어로 교체");
				car.frontrightTire =new KumhoTire("앞오른쪽",15);
			case 3:
				System.out.println("뒤왼쪽 한국타이어로 교체");
				car.backLeftTire =new HankookTire("뒤왼쪽",15);
			case 4:
				System.out.println("뒤오른쪽 한국타이어로 교체");
				car.backRightTire =new KumhoTire("뒤오른쪽",15);
			}
			System.out.println();
		}

	}

}
