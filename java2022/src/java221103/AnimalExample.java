package java221103;

public class AnimalExample {

	public static void main(String[] args) {
//		Dog dog =new Dog();
//		Cat cat =new Cat();
//		dog.sound();//Dog
//		cat.sound();//Cat
//		System.out.println("--------");
//		
//		//변수의 자동 타입 변환
//		Animal animal =null;
//		animal =new Dog();//업캐스팅
//		animal.sound();//동적바인딩 발생, Dog꺼 수행
//		
//		animal =new Cat();//업캐스팅
//		animal.sound();//동적바인딩 발생, Cat꺼 수행
//		System.out.println("---------");
		
		//메소드의 다형성;
		animalSound(new Dog());//동적바인딩 발생, Dog꺼 수행
		animalSound(new Cat());//동적바인딩 발생, Cat꺼 수행
		

	}
	static void animalSound(Animal animal) {
		animal.sound();
	}
}
