package review11128;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {
		Socket socket =null;
		try {
			socket = new Socket();//socket����
			System.out.println("�����û");
			socket.connect(new InetSocketAddress("localhost",5001));
			System.out.println("[���� ����]");
		}catch (Exception e) {//������ �Ǿ� ���� ���
			try {
				socket.close();//���� ����
			}catch (IOException e1) {
				// TODO: handle exception
			}
		}

	}

}
