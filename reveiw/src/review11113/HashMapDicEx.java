package review11113;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapDicEx {

	public static void main(String[] args) {
		// ���� �ܾ�� �ѱ� �ܾ��� ���� �����ϴ� HashMap �÷��� ����
		HashMap<String, String> dic = new HashMap<String, String>();

		// 3���� (key,value) ���� dic�� ����
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");

		// dic �÷��ǿ� ����ִ� ��� (key,vlaue)�� ���
		Set<String> keys = dic.keySet();// key ���ڿ��� ���� Set ����
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = dic.get(key);
			System.out.println("(" + key + "," + value + ")");
		}
			// ���� �ܾ �Է� �ް� �ѱ� �ܾ� �˻�
			Scanner sc= new Scanner(System.in);
			for (int i = 0; i < dic.size(); i++) {
				
				System.out.println("ã�� ���� �ܾ��?");
				String se= sc.next();
				System.out.println(dic.get(se));
			
		}

	}

}
