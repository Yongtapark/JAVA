package review11128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {
//클라이언트 서버 일대일로 채팅
	public static void main(String[] args) {
		BufferedReader in=null;
		BufferedReader stin=null;
		BufferedWriter out=null;
		ServerSocket listener=null;
		Socket socket =null;
		try { 
			listener=new ServerSocket(5432);//서버 소캣생성
			socket=listener.accept();//클라이언트로부터 연결요청 대기
			System.out.println("연결됨");
			//클라이언트로부터 입력 스트림 얻기
			in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			stin=new BufferedReader(new InputStreamReader(System.in));
			
			out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			String inputMessage;
			
			while(true) {
				//클라이언트에서 한 행의 문자열 읽음
				inputMessage = in.readLine();
				//클라이언트가 "bye"를 외치면 연결 종료
				if(inputMessage.equalsIgnoreCase("bye"))
					break;
				//클라이언트가 보낸 메시지 화면에 출력
				System.out.println(inputMessage);
				//키보드에서 한 행의 문자열 읽음
				String outputMessage =stin.readLine();
				//키보드에서 읽은 문자열 전송
				out.write("server>"+outputMessage+"\n");
				out.flush();
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();//클라이언트와 통신용 소켓 닫기
				listener.close();//서버 소켓 닫기
			}catch (IOException e) {
				System.out.println("error");
			}
		}

	}

}
