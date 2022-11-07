package java221104;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {
		int i=10;
		//Integer j=new Integer(i);
		Integer intObject = i; // auto boxing
		//wrapper 클래스로 변환
		
		//System.out.println("intObject ="+intObject.intValue());
		System.out.println("intObject ="+intObject);
		
		//i=intObject.intValue()+10;
		i= intObject+10;//auto unboxing
		System.out.println("i ="+i);
		
		String a="java";
		String b="jasa";
		int res =a.compareTo(b);
		if(res==0)
			System.out.println("the same");
		else if(res<0)
			System.out.println(a+"<"+b);
		else
			System.out.println(a+">"+b);
	}
		
	

}
