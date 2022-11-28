package review11128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {
//Ŭ���̾�Ʈ ���� �ϴ��Ϸ� ä��
	public static void main(String[] args) {
		BufferedReader in=null;
		BufferedReader stin=null;
		BufferedWriter out=null;
		ServerSocket listener=null;
		Socket socket =null;
		try { 
			listener=new ServerSocket(5432);//���� ��Ĺ����
			socket=listener.accept();//Ŭ���̾�Ʈ�κ��� �����û ���
			System.out.println("�����");
			//Ŭ���̾�Ʈ�κ��� �Է� ��Ʈ�� ���
			in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			stin=new BufferedReader(new InputStreamReader(System.in));
			
			out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			String inputMessage;
			
			while(true) {
				//Ŭ���̾�Ʈ���� �� ���� ���ڿ� ����
				inputMessage = in.readLine();
				//Ŭ���̾�Ʈ�� "bye"�� ��ġ�� ���� ����
				if(inputMessage.equalsIgnoreCase("bye"))
					break;
				//Ŭ���̾�Ʈ�� ���� �޽��� ȭ�鿡 ���
				System.out.println(inputMessage);
				//Ű���忡�� �� ���� ���ڿ� ����
				String outputMessage =stin.readLine();
				//Ű���忡�� ���� ���ڿ� ����
				out.write("server>"+outputMessage+"\n");
				out.flush();
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();//Ŭ���̾�Ʈ�� ��ſ� ���� �ݱ�
				listener.close();//���� ���� �ݱ�
			}catch (IOException e) {
				System.out.println("error");
			}
		}

	}

}
