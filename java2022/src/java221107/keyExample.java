package java221107;

import java.util.HashMap;
class A{
	@Override
	public String toString() {
		
		return "객체 처리가 잘 되었습니다.";
	}
}
public class keyExample {

	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key,String> hashMap =new HashMap<Key, String>();
		
		//식별키 "New Key(1)"로 홍길동은 저장함
		hashMap.put(new Key(1),"홍길동");//hashcode가 다르기 때문에 못읽음
		
		String value=hashMap.get(new Key(1));
		System.out.println(value);//null 출력
		Object obj =new Object();
		A a=new A();
		System.out.println(a);
		System.out.println(a.toString());
		

	}

}
