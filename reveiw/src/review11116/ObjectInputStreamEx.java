package review11116;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {

	public static void main(String[] args) {
		try {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/review11116/test.txt"));
			Data data=(Data) ois.readObject();
			System.out.println("-------------------");
			System.out.println("��ȣ :"+data.getNo());
			System.out.println("�̸� :"+data.getName());
			System.out.println("�̸��� :"+data.getMail());
			
			System.out.println(data.toString());
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
