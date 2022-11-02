package java221102;
class Pet{
	int age;
	public void eat() {
		System.out.println("모든 동물들은 밥을 먹는다.");
	}
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Dog extends Pet{
	String name;
	int weight;
	@Override
	public void eat() {
		System.out.println("킁킁거리면서 강아지 사료를 먹는다 .. ");
	}
	int getWeight() {
		return weight;
	}
}
class Bird extends Pet{
	String type;
	boolean flight;
	
	boolean getflight() {
		return flight;
	}
	@Override
	public void eat() {
		System.out.println("먹이를 쪼아 먹는다..");
	}
}


public class homework {

	public static void main(String[] args) {
		
		Dog dog1= new Dog();
		dog1.age =3;
		dog1.name= "누렁이";
		dog1.weight =10;
		
		Bird bird1 =new Bird();
		bird1.age=5;
		bird1.type ="앵무새";
		bird1.flight=true;
		
		
		dog1.move();
		bird1.move();
		
		System.out.println("강아지 이름은"+dog1.name+"고, 나이는"+dog1.age+"살, 몸무게는 " +
		dog1.getWeight()+"kg 입니다.");
		System.out.println("새의 종류는 "+bird1.type+"고, 나이는"+dog1.age+"살, 날 수 "
				+(bird1.getflight()? "있":"없")+"습니다.");
		
		System.out.println("--------------eat() Overriding-----------");
		Pet pet=new Pet();
		System.out.print("Pet.eat() :");pet.eat();
		System.out.print("Dog.eat () :");dog1.eat();
		System.out.print("Bird.eat () :");bird1.eat();
		
		System.out.println("-----------------업캐스팅하여 실행-------------");
		Pet p1=new Dog();
		Pet p2=new Bird();
		
		p1.move();
		p2.move();
		
		

	}

}
