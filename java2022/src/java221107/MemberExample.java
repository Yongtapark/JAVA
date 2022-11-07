package java221107;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1=new Member("blue");
		Member obj2=new Member("blue");
		Member obj3=new Member("red");
		
		System.out.println(obj1.id+" "+obj2.id+" "+obj3.id);
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		}else {
			System.out.println("obj1과 obj3dms 동등하지 않습니다.");
		}
		System.out.println(obj1.hashCode());//실제주소, 논리적주소 다르다
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
	}

}
