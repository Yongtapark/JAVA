package review11113;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Student{
	int id;
	String tel;
	Student(int id, String tel){
		this.id=id;
		this.tel=tel;
	}
}
public class HashMapStudentEx {

	public static void main(String[] args) {
		HashMap<String,Student> map = new HashMap<String,Student>();
		
		map.put("�ѿ���",(new Student(2,"010-222-2222")));
		map.put("Ȳ����",(new Student(1,"010-111-2222")));
		map.put("�̿���",(new Student(3,"010-333-2222")));
		
		System.out.println("HashMap�� ��� ���� :"+map.size());

		Set<String> k =map.keySet();
		Iterator<String> it= k.iterator();
		while(it.hasNext()) {
			String name = it.next();
			Student student =map.get(name);
			System.out.println(name + student.id + student.tel);
			
		}
	}

}
