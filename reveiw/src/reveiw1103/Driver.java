package reveiw1103;

public class Driver {
	void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus= (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
