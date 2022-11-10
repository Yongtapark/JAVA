package review1110;

public class Compare {

	public static void main(String[] args) {
		Pair<Integer, String>p1 =new Pair<Integer,String>(1,"사과");
		Pair<Integer, String>p2 =new Pair<Integer,String>(1,"사과");
		//boolean result1 =Util.<Integer, String>compare(p1,p2);// 구체적 타입을 명시적으로 지정
		boolean result1 =Util.compare(p1, p2);
		if(result1) {
			System.out.println("논리적으로 동등한 객체입니다");
		}else {
			System.out.println("동등하지 않아요");
		}
		
		Pair<String, String>p3=new Pair<String, String>("user1","홍길동");
		Pair<String, String>p4=new Pair<String, String>("user2","홍길동");
		boolean result2 =Util.<String, String>compare(p3,p4);// 구체적 타입을 명시적으로 지정
		//boolean result2 =Util.compare(p3, p4);
		if(result2) {
			System.out.println("논리적으로 동등한 객체입니다");
		}else {
			System.out.println("동등하지 않아요");
		}
	}

}
