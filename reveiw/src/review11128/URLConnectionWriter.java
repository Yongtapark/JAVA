package review11128;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionWriter {

	public static void main(String[] args) {
		try {
			//POST가 가능한 사이트 URL 객체 생성
			URL aURL =new URL("https://httpbin.org/post");
			URLConnection uc= aURL.openConnection();//URLConnection 객체 생성
			uc.setDoOutput(true);//출력 모드 설정
			OutputStreamWriter out =new OutputStreamWriter(uc.getOutputStream());//출력스트림생성
			out.write("fname=Kitae&name=hwang");//서버에 데이터 전송
			out.close();
			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));//입력스트림 생성
			String inputLine;
			while((inputLine=in.readLine())!=null)//한 행씩 읽음
				System.out.println(inputLine);
			in.close();
		}catch (IOException e) {
			System.out.println("URL 입출력 오류");
		}

	}

}
