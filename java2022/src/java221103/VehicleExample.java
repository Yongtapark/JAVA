package java221103;

public class VehicleExample {

	public static void main(String[] args) {
		//자동캐스팅, 업캐스팅, 부모의 특성만 사용, 자식의 특성을 사용못함
		// 자식 특성 사용하려면 다운캐스팅해야함
		Vehicle v=new Bus();
		v.run();
		Bus bus=(Bus)v;
		bus.run();
		bus.check();
		
		
		
	}

}
