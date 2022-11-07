package java221103;

public class Dog extends Animal {
	Dog(){
		this.kind = "포유류";
	}
	
	@Override
	void sound() {
		System.out.println("으르르 왈왈");
		
	}

}
