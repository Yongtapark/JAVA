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
			//POST가 가능한 사이트 URL객체 생성
			URL aURL= new URL("https://httpbin.org/post");
			URLConnection uc= aURL.openConnection();//URLConnection 객체 생성
			uc.setDoOutput(true);//출력모드 설정
			OutputStreamWriter out =new OutputStreamWriter(uc.getOutputStream());//출력스트림 생성
			out.write("fname=Kitae&name=Hwang");//서버에 데이터 보내기
			out.close();
			BufferedReader in =new BufferedReader(new InputStreamReader(uc.getInputStream()));//입력스트림 생성
			String inputLine;
			while((inputLine=in.readLine())!=null)//한행 씩 읽음
				System.out.println(inputLine);
			in.close();
		}catch (IOException e) {
			System.out.println("연결오류");
		}

	}

}
