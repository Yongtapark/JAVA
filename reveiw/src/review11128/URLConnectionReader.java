package review11128;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {

	public static void main(String[] args) {
		try {
			// url객체 생성
			URL aURL = new URL("https://www.nate.com");

			// url객체에서 URLConnection 객체 생성
			URLConnection uc = aURL.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			// 입력스트림생성
			String inputLine;
			
			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
			}
			in.close();
		} catch (IOException e) {
			System.out.println("URL을 읽는 도중 오류발생");

		}
	}
}
