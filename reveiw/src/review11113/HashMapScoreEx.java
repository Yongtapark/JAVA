package review11113;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		HashMap<String,Integer> JavaScore =new HashMap<String, Integer>();
		
		JavaScore.put("�ѿ���", 99);
		JavaScore.put("��ȫ��", 97);
		JavaScore.put("Ȳ����", 34);
		JavaScore.put("�̿���", 98);
		JavaScore.put("������", 70);
		
		System.out.println("HashMap �� ��� ���� :" + JavaScore.size());
		Set<String>  keys =JavaScore.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			Integer value = JavaScore.get(key);
			System.out.println(key+":"+value);
		}
		
		

	}

}
