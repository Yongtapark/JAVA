package java1027;

	
	 public class Person{
		//필드=데이터=멤버변수=전역변수=클래스변수=속성 :명사,형사
		//멤버변수 : 1.static (x) 인스턴스멤버변수 :객체생성(new)후 사용, 메모리에 없음
		//		  2.static	(o) 클래스멤버변수 : 객체생성없이 사용 , 이미 메모리에 올라옴
		private String name;
		private int age;
		//생성자, 인자가 없는 생성자를 기본생성자,
		//생성자 : 리턴형이 없는 메소드이며, 기본이 public, 목적:객체생성,멤버변수 초기화
		//디폴트 생성자 :Person 객체명 = new Person();//했을때 자동호출됨
		//디폴트 생성자가 없으면 jvm이 자동으로 넣어줌,(단, 또다른 생성자가 없을때만)
		//또다른 생성자를 호출하고 디폴트 생성자를 호출할때 디폴트를 jvm이 자동으로 넣어주지 않기 때문에
		//꼭 넣어주어야 한다. 상속이 안된다.
		public static int key;
		public Person() {
			System.out.println("기본생성자");
		}
		
		
		public Person(String s) {//Person aPerson - new Person("김미남")
			name=s;//멤버변수 초기화
			System.out.println("매개변수 있는 생성자");
		}
		
		//getter() 멤버변수값 인출하기
		public String getName() {
			return name;
		}
	
		//setter() 멤버변수값 저장
		public void setName(String name) {
			this.name=name;//
		}
		public int getAge() {
			return age;
		}public void setAge(int age) {
			this.age=age;//현재 객체에 age값을 넣어라
		}
	public static void main(String[] args) {
		Person aPerson;//객체선언
		aPerson = new Person("김미남");//객체생성
		Person aPerson2= new Person();//디폴트 생성자 호출하면서 객체생성
		
	 aPerson.age=30;//멤버변수 [직접 접근], 값 저장
	 
	 int i = aPerson.age;//멤버변수의 값 인출,[직접인출]
	 aPerson.setName("홍길동");//김미남 -> 홍길동 변경, 멤버변수의 [간접접근]
	 aPerson.setAge(19);
	 
	 //멤버변수의 값을 getter()를 통해 [간접접근], 값 인출
	String s= aPerson.getName();//홍길동,[간접인출]
	 System.out.println("이름 :"+s);
	 System.out.println("나이 :"+aPerson.age);
	 //직접접근 
	 aPerson.name="박길동";
	 s= aPerson.name;
	 aPerson.age=28;
	 key=20;
	 Person.key=20;
	 aPerson.key=20;
	 System.out.println("이름 :"+aPerson.name);//직접 이름 출력
	 System.out.println("나이 :"+aPerson.age);//직접 나이 출력
		
	 //간접접근 이름 주기
	 aPerson.setName("간접박");
	 String n= aPerson.getName();
	 aPerson.setAge(19);
	 int a= aPerson.getAge();
	 
	 
	 System.out.println("이름 :"+n);//간접 이름 출력
	 System.out.println("나이 :"+a);//간접 나이 출력
	}}
	
