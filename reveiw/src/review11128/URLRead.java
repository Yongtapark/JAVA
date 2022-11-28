package review11128;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLRead {

	public static void main(String[] args) {
		try {
			// url ��ü ����
			URL aURL = new URL("https://www.naver.com");

			// URL ��ü���� �Է� ��Ʈ�� ����
			BufferedReader in = new BufferedReader(new InputStreamReader(aURL.openStream()));

			String inputLine;

			while ((inputLine = in.readLine()) != null)// �� �྿ ����
				System.out.println(inputLine);
			in.close();
		} catch (IOException e) {
			System.out.println("url���� �����͸� �д��� ���� �߻�");
		}

	}

}
