package review11128;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {

	public static void main(String[] args) {
		try {
			// url��ü ����
			URL aURL = new URL("https://www.nate.com");

			// url��ü���� URLConnection ��ü ����
			URLConnection uc = aURL.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			// �Է½�Ʈ������
			String inputLine;
			
			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
			}
			in.close();
		} catch (IOException e) {
			System.out.println("URL�� �д� ���� �����߻�");

		}
	}
}
