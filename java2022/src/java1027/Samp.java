package java1027;

public class Samp {
	int id;
	public Samp(int x) {this.id=x;}
	public void set(int x) {
		//현재 호출한 객체자신
		this.id=x;}//this.필드=값
	
	//this : 현재 객체 자신(각각 자기가 속한 객체에 대한 주소(레퍼런스))
	//this() : 디폴트 생성자를 호출, 생성자 내 첫줄에 위치해야 함
	//this(인자,인자) : 인자값이 있는 생성자를 호출, 생성자내 첫줄에 위치해야 함
	//this.필드 : 현재 객체의 필드를 가르킴
	//this.메소드() :현재 객체의 메소드 호출
	public int get() {return this.id;}
	
	public static void main(String[] args) {
		Samp ob1= new Samp(3);
		Samp ob2= new Samp(3);
		Samp ob3= new Samp(3);
		
		ob1.set(5);
		ob2.set(6);
		ob3.set(7);
		
		
		System.out.println("ob1="+ob1.id);
		System.out.println("ob2="+ob2.id);
		System.out.println("ob3="+ob3.id);
		System.out.println();
		
		System.out.println("ob1="+ob1.get());
		System.out.println("ob2="+ob2.get());
		System.out.println("ob3="+ob3.get());
	}

}
