package java221103;

public class CarExample {

	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.run();
		//배열을 이용한 필드의 다형성
		myCar.tires[0]=new KumhoTire();
		myCar.tires[1]=new KumhoTire();
		
		
		myCar.run();

	}

}
