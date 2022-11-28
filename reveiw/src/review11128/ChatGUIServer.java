package review11128;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChatGUIServer {
	ServerSocket ss;
	Socket s;
	Vector v;
	public ChatGUIServer() {
		v=new Vector();
	}
	public void addThread(ServerThread st) {
		v.addElement(st);
	}
	public void removeThread(ServerThread st) {
		v.removeElement(st);
	}
	public void broadcast(String str) {
		for(int i=0; i<v.size();i++) {
			ServerThread st=(ServerThread)v.elementAt(i);
			st.send(str);
		}
	}
	
	public void go() {
		try {
			ss=new ServerSocket(5555);
			System.out.println("��������");
			while(true) {
				s=ss.accept();
				ServerThread st=new ServerThread(this,s);
				addThread(st);
				st.start();
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	};//go
	
	
	public static void main(String[] args) {
		ChatGUIServer cs=new ChatGUIServer();
		cs.go();

	}

}

class ServerThread extends Thread{
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	ChatGUIServer cg;
	String str;
	String name;
	InetAddress ip;
	
	public ServerThread(ChatGUIServer cg, Socket s) {
		this.cg=cg;this.s=s;
		ip=s.getInetAddress();
		System.out.println(ip+"�� �����Ͽ����ϴ�.");
		try {
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw=new PrintWriter(s.getOutputStream(),true);//append
		}catch (IOException e) {
			e.getMessage();
		}
		
	};//������ ��
	public void send(String str) {
		pw.println(str);
	}
	@Override
	public void run() {
		try {
			name=br.readLine();
			cg.broadcast("["+name+"]���� �����ϼ̽��ϴ�.");
			
			while((str=br.readLine())!=null) {
				cg.broadcast("["+name+"]"+str);
			}
		}catch(Exception e) {
			cg.removeThread(this);
			cg.broadcast("["+name+"]���� �����ϼ̽��ϴ�.");
			System.out.println(ip+"�� ������ ����Ǿ����ϴ�");
		}
	}
}//ServerThread end
