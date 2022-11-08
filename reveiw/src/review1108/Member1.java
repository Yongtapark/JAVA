package review1108;

public class Member1 implements Cloneable{
	String id;
	String name;
	String password;
	int age;
	boolean adult;
	
	public Member1(String id, String name, String password, int age, boolean adult){
		this.id=id;
		this.name=name;
		this.password=password;
		this.age=age;
		this.adult=adult;
	}
	
	public Member1 getMember() {
		Member1 cloned =null;
		try {
			cloned=(Member1)clone();
		}catch (CloneNotSupportedException e) {}
		return cloned;
	}
}
