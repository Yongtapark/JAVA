package java221103;

public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
		if(vehicle instanceof Bus) {
			Bus a=(Bus)vehicle;
			a.run();
		}
		
	}
}
