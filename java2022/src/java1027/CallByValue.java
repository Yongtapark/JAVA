package java1027;
class Person4{
	public String name;
	public int age;
	
	public Person4(String s) {
		name=s;
	}
	//메소드의 원형(prototype) :형식매개변수 형식인수 형식인자
	public void setAge(int n) {
		age=n;
		n++;
	}
}
public class CallByValue {

	public static void main(String[] args) {
		Person4 aPerson=new Person4("홍길동");
		int a=33;//값의 변화 없다.
		//실매개변수 값,실인수,실인자
		aPerson.setAge(a);//call by value방식, 값전달방식,값변경없음
		
		System.out.println(a);

	}

}
