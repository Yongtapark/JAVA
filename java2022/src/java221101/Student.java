package java221101;
class Person{
	int age;
	public String name;
	protected int height;
	private int weight;
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public int getWeight() {
		return weight;
	}
}
public class Student extends Person {

	void set() {
		age=30;
		name="홍길동";
		height=175;
		setWeight(99);
		System.out.println(age);
		System.out.println(name);
		System.out.println(height);
		System.out.println(getWeight());
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.set();
		

		

	}

}
