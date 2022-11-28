package review11128;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {
		Socket socket =null;
		try {
			socket = new Socket();//socket생성
			System.out.println("연결요청");
			socket.connect(new InetSocketAddress("localhost",5001));
			System.out.println("[연결 성공]");
		}catch (Exception e) {//연결이 되어 있을 경우
			try {
				socket.close();//연결 끊기
			}catch (IOException e1) {
				// TODO: handle exception
			}
		}

	}

}
