package java1027;

public class cl271 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person aPerson=new Person("홍길동1");
		
		//aPerson.age=30;
		//int i=aPerson.age;
		//aPerson.setAge(19);
		int i=aPerson.getAge(); //얘는 왜 set을 쓰고 나오지? //그리고 person은 지금 19세 변경박인데 홍길동 0? 
		String s=aPerson.getName();//얘는 왜 get만써도 나오지?//person 파일과는 별개라고 생각하면됨
		//aPerson.key=20;(가능)
		Person.key=20;//(가능)
		//key=20;(static이 붙어도 같은클래스가 아니면 그냥은 쓸 수없다.)
		
		System.out.println("이름 :"+s);
		System.out.println("나이 :"+i);
		System.out.println("키 : "+aPerson.key);
	}

}
