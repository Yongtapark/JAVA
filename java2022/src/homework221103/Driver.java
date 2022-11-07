package homework221103;

public class Driver {
	// 메소드의 다형성 // 자동캐스팅=업캐스팅 , 묵시적캐스팅ㄴ
	void drive(Vehicle vehicle) {
		vehicle.run();
		/*
		 * if (vehicle instanceof Bus) { Bus a = (Bus) vehicle;// 다운캐스팅
		 * 
		 * }
		 */
	}
}
