package java221102;

class Person {
	String Phone;
	public void setPhone(String Phone) {
		this.Phone = Phone;
	}
	public String getPhone() {
		return Phone;
	}
}

class Professor extends Person {
	public String getPhone() {
		return "Professor : " + super.getPhone();
	}
}

public class Overriding {
	public static void main(String[] args) {
		Professor a = new Professor();
		a.setPhone("011-123-1234");
		System.out.println(a.getPhone());
		Person p = a;
		System.out.println(p.getPhone());

	}

}
