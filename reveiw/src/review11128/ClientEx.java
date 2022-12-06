package review11128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientEx {
	// 1.unicasting ��� : 1:1 ���
	// 2.broadcasting���: ��: ��(��۱�)
	// 3.multicasting���: ��: �� (ȭ��ȸ��)

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedReader stin = null;
		BufferedWriter out = null;
		Socket socket = null;
		try {
			// Ŭ���̾�Ʈ ���� ����
			socket = new Socket("localhost", 5432);
			// �����κ����� �Է� ��Ʈ�� ������
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// Ű����κ����� �Է� ��Ʈ�� ����
			stin = new BufferedReader(new InputStreamReader(System.in));

			// �������� ��� ��Ʈ�� ������
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			String outputMessage;
			while (true) {
				// Ű���忡�� �� ���� ���ڿ� ����
				outputMessage = stin.readLine();
				// "bye"�� �ԷµǸ� �޽��� ���� �� ���� ����
				if (outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage);
					out.flush();
					break;
				}
				// Ű���忡�� ���� ���ڿ� ����
				out.write("client>" + outputMessage + "\n");
				out.flush();
				// �������� �� ���� ���ڿ� ����
				String inputMessage = in.readLine();

				System.out.println(inputMessage);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();// Ŭ���̾�Ʈ ���� �ݱ�
			} catch (IOException e) {
				System.out.println("errer.");
			}
		}

	}

}