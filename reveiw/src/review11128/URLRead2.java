package review11128;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLRead2 {

	public static void main(String[] args) {
		try {
			// URL ��ü ����
			URL aURL = new URL("https://www.nate.com");

			// URL ��ü���� �Է� ��Ʈ�� ����
			BufferedReader in = new BufferedReader(new InputStreamReader(aURL.openStream()));
			// URL ��ü�� ����Ű�� �ּҿ��� �����͸� ������ �� ������ openStream() �޼ҵ�� ��Ʈ�� ����
			String inputLine;

			while ((inputLine = in.readLine()) != null)
				// ���྿ ����
			System.out.println(inputLine);
			in.close();
		} catch (IOException e) {
			System.out.println("URL���� �����͸� �д� �� ������ �߻��߽��ϴ�.");
		}

	}

}
