package review11113;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		HashMap<String,Integer> JavaScore =new HashMap<String, Integer>();
		
		JavaScore.put("한원선", 99);
		JavaScore.put("한홍진", 97);
		JavaScore.put("황기태", 34);
		JavaScore.put("이영희", 98);
		JavaScore.put("정원석", 70);
		
		System.out.println("HashMap 의 요소 개수 :" + JavaScore.size());
		Set<String>  keys =JavaScore.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			Integer value = JavaScore.get(key);
			System.out.println(key+":"+value);
		}
		
		

	}

}
