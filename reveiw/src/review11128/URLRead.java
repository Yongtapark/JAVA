package review11128;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLRead {

	public static void main(String[] args) {
		try {
			// url 객체 생성
			URL aURL = new URL("https://www.naver.com");

			// URL 객체에서 입력 스트림 생성
			BufferedReader in = new BufferedReader(new InputStreamReader(aURL.openStream()));

			String inputLine;

			while ((inputLine = in.readLine()) != null)// 한 행씩 읽음
				System.out.println(inputLine);
			in.close();
		} catch (IOException e) {
			System.out.println("url에서 데이터를 읽는중 오류 발생");
		}

	}

}
