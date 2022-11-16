package review11116;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx {

	public static void main(String[] args) {
		ObjectOutputStream op;
		
		try {
			op= new ObjectOutputStream(new FileOutputStream("src/review11116/test.txt"));
			Data data =new Data();//직렬화 할 객체 생성
			data.setNo(30);
			data.setMail("insangsuba@nate.com");
			data.setName("김공부");
			op.writeObject(data);//데이터 직렬화
			
		}catch (Exception e) {
			e.getStackTrace();
		}

	}

}
