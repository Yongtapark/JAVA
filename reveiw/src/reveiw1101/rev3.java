package reveiw1101;

class Person {
	int age;
	public String name;
	protected int height;
	private int weight;

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

}

public class rev3 extends Person {
	void set() {
	age = 30;
	name = "ȫ�浿";
	height = 175;
	setWeight(99);
	System.out.println(age);
	System.out.println(name);
	System.out.println(height);
	System.out.println(getWeight());
	}
	public static void main(String[] args) {
		rev3 s=new rev3();
		s.set();
		

	}

}
