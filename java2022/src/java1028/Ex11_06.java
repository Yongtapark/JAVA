package java1028;
class Car5{
	private String color;
	private int speed;

	Car5(){
		color="빨강";
		speed=0;
	}
	
	public String getColor() {
		return color;
	}
	public int getspeed() {
		return speed;
	}
	
}

public class Ex11_06 {
	public static void main(String[] args) {
		Car5 myCar1=new Car5();
		Car5 myCar2=new Car5();
		
		System.out.println("자동차1의 색상은"+myCar1.getColor()+"이며, 현재속도는"+myCar1.getspeed()+"입니다.");
		System.out.println("자동차2의 색상은"+myCar2.getColor()+"이며, 현재속도는"+myCar2.getspeed()+"입니다.");

	}

}
