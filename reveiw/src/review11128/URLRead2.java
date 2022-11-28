package review11128;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLRead2 {

	public static void main(String[] args) {
		try {
			// URL 객체 생성
			URL aURL = new URL("https://www.nate.com");

			// URL 객체에서 입력 스트림 생성
			BufferedReader in = new BufferedReader(new InputStreamReader(aURL.openStream()));
			// URL 객체가 가르키는 주소에서 데이터를 가지고 올 때에는 openStream() 메소드로 스트림 생성
			String inputLine;

			while ((inputLine = in.readLine()) != null)
				// 한행씩 읽음
			System.out.println(inputLine);
			in.close();
		} catch (IOException e) {
			System.out.println("URL에서 데이터를 읽는 중 오류가 발생했습니다.");
		}

	}

}
