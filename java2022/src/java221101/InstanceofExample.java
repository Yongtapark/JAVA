package java221101;
class Perso{}
class Studentt extends Perso{}
class Researchers extends Perso{}
class Professor extends Researchers{}
public class InstanceofExample {

	public static void main(String[] args) {
		Perso jee=new Studentt();
		Perso kim=new Professor();
		Perso lee=new Researchers();
		if(jee instanceof Studentt)
			System.out.println("jee는 studentt 타입");
		if(jee instanceof Researchers)
			System.out.println("jee는 studentt 타입");
		
		if(kim instanceof Studentt)
			System.out.println("kim은 studentt 타입");
		if(kim instanceof Professor)
			System.out.println("kim은 Professor 타입");
		if(kim instanceof Researchers)
			System.out.println("kim은 Researcher 타입");
		if(kim instanceof Perso)
			System.out.println("kim은 Persons 타입");
		
		if(lee instanceof Professor)
			System.out.println("kim은 Professor 타입");
		if("java" instanceof String)
			System.out.println("\"java\"는 String 타입");

		//다형성
		aa(lee);//Student,Researchers,Professor
		
		
	}
	//메소드 정의
	//부모 타입으로 받는 메소드 정의하세요.
	public static void aa(Perso lee) {//부모타입을 객체로 받음==타형성
		if(lee instanceof Studentt) {
			System.out.println("lee는 Studentt 타입");
			// student3로 다운캐스팅
			Studentt s=(Studentt)lee;//다운캐스팅
			
		}else if(lee instanceof Researchers) {
			Researchers s=(Researchers)lee;//다운캐스팅
			System.out.println("lee가 Researchers 타입");
		}else {
			Professor s=(Professor)lee;
			System.out.println("lee가 Professor 타입");
		}
		
		
	}

}
