package review11113;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapDicEx {

	public static void main(String[] args) {
		// 영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성
		HashMap<String, String> dic = new HashMap<String, String>();

		// 3개의 (key,value) 쌍을 dic에 저장
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");

		// dic 컬렉션에 들어있는 모든 (key,vlaue)쌍 출력
		Set<String> keys = dic.keySet();// key 문자열을 가진 Set 리턴
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = dic.get(key);
			System.out.println("(" + key + "," + value + ")");
		}
			// 영어 단어를 입력 받고 한글 단어 검색
			Scanner sc= new Scanner(System.in);
			for (int i = 0; i < dic.size(); i++) {
				
				System.out.println("찾고 싶은 단어는?");
				String se= sc.next();
				System.out.println(dic.get(se));
			
		}

	}

}
