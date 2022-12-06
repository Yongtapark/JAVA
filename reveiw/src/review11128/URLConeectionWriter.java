package review11128;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class URLConeectionWriter {

	public static void main(String[] args) {
		try {
			//POST�� ������ ����Ʈ URL��ü ����
			URL aURL= new URL("https://httpbin.org/post");
			URLConnection uc= aURL.openConnection();//URLConnection ��ü ����
			uc.setDoOutput(true);//��¸�� ����
			OutputStreamWriter out =new OutputStreamWriter(uc.getOutputStream());//��½�Ʈ�� ����
			out.write("fname=Kitae&name=Hwang");//������ ������ ������
			out.close();
			BufferedReader in =new BufferedReader(new InputStreamReader(uc.getInputStream()));//�Է½�Ʈ�� ����
			String inputLine;
			while((inputLine=in.readLine())!=null)//���� �� ����
				System.out.println(inputLine);
			in.close();
		}catch (IOException e) {
			System.out.println("�������");
		}

	}

}