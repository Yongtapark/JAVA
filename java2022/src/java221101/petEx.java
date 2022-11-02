package java221101;

class Pet {
	String type = "동물";
	int age;
	String name;

	void move() {
		System.out.println(type + "(이)가 움직입니다.");
	}
}

//-------------------------------------------------------------------------
class Dog extends Pet {
	{
		age = 3;
		type = "강아지";
		name = "누렁이";
	}
	String weight = "10kg";

	void name() {
		System.out.println("강아지의 이름은 " + name + "이고, 몸무게는 " + weight + "입니다");
	}

}
//---------------------------------------------------------------------------------

class Bird extends Pet {
	{
		type = "앵무새";
		age = 5;
	}

	void name() {
		System.out.print("새의 종류는 " + type + " 이고 나이는" + age + "살");
	}

	void flight() {

		System.out.println(", 날 수 있습니다.");
	}

}

public class petEx {

	public static void main(String[] args) {
		Pet pt = new Pet();
		pt.move();
		pt.move();
		Dog dog = new Dog();
		dog.name();
		Bird bb = new Bird();
		bb.name();
		if (bb instanceof Bird) {
			bb.flight();
		}

	}

}
