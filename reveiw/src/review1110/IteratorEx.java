package review1110;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

	public static void main(String[] args) {
		//정수값만 다루는 제네릭 벡터 생성
		Vector<Integer> v= new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		//Iterator를 이용한 모든 정수 출력하기
		Iterator<Integer> it=v.iterator();//Iterator 객체 얻기
		while(it.hasNext()){ //안에 수가 남아 있다면
			int n= it.next();
			System.out.println(n);
		}
		
		//iterator를 이용하여 모든 정수 더하기
		int sum=0;
		it =v.iterator(); //Iterator 객체 얻기
		while(it.hasNext()) {
			int n=it.next();
			sum+=n;
		}
		System.out.println("벡터에 있는 정수 합 : "+sum);

	}

}
