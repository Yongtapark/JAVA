package reveiw1102;
class Person{
	private String phone;
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String getPhone() {
		return phone;
	}
	
}
class Professor extends Person{
	public String getPhone() {
		return "professor :"+super.getPhone();
	}
}

public class rev2MethodOverriding {

	public static void main(String[] args) {
		Professor a=new Professor();
		a.setPhone("010-1234-1234");
		System.out.println(a.getPhone());
		Person p= a;
		System.out.println(p.getPhone());

	}

}
