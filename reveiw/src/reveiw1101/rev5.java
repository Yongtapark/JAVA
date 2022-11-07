package reveiw1101;
class Persons{
	String name;
	String id;
	Persons(String name){
		this.name=name;
	}
}
class Students extends Persons{
	String grade;
	String department;
	
	Students(String name){
		super(name);
	}
}
public class rev5 {

	public static void main(String[] args) {
		Persons p;
		Students s=new Students("홍길동");
		p=s;
		System.out.println(p.name);
		
		s=(Students)p;
		s.grade="1gkrsus";
		s.department="컴퓨터학과";
		System.out.println(s.grade);
		System.out.println(s.department);
		System.out.println(p.name);

	}

}
