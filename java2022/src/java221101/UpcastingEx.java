package java221101;
class Persons{
	String name;
	String id;
	public Persons(String name) {
		this.name=name;
	}
}
class Students extends Persons{
	String grade;
	String department;
	
	public Students(String name) {
		super(name);//부모생성자 호출
	}
}




public class UpcastingEx {

	public static void main(String[] args) {
		Persons p;
		Students s= new Students("홍길동");
		p=s; //업캐스팅!,자동캐스팅 부모타입=자식타입, 다형성을 이유로 업캐스팅
		//부모타입을 하면 자식의 멤버들을 사용할 수 없음,
		//다형성을 지원하기 위해 업캐스팅 함.
		
		System.out.println(p.name);
		
		//p.grade="a";
		//p.department="Com";
		
		s=(Students)p;//다운캐스팅, 자식타입=(자식타입)부모타입,원형태로 변환
		s.grade="1학년";
		s.department="컴퓨터학과";
		System.out.println("학년 : "+s.grade);
		System.out.println("과 : "+s.department);
		System.out.println("이름 : "+s.name);
				
		

	}

}
