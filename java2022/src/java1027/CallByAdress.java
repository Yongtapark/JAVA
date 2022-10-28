package java1027;
class Person5{
	public String name;
	public int age;
	public Person5(String s) {
		name=s;
	}
	public void setAage(MyInt2 i) {
		age=i.val;
		i.val++;
	}
};
class MyInt2{
	int val;
	MyInt2(int i){
		val=i;
	}
};

public class CallByAdress {
	
	public static void main(String[] args) {
		Person5 aPerson =new Person5("홍길동");
		MyInt2 a=new MyInt2(33);
		
		aPerson.setAage(a);// call by address,주소전달방식,값변화 있음
		
		System.out.println(a.val);

	}

}
