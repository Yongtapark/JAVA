package review11116;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx {

	public static void main(String[] args) {
		ObjectOutputStream op;
		
		try {
			op= new ObjectOutputStream(new FileOutputStream("src/review11116/test.txt"));
			Data data =new Data();//����ȭ �� ��ü ����
			data.setNo(30);
			data.setMail("insangsuba@nate.com");
			data.setName("�����");
			op.writeObject(data);//������ ����ȭ
			
		}catch (Exception e) {
			e.getStackTrace();
		}

	}

}
