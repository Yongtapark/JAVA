package review11128;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatGUIClient extends JFrame implements ActionListener,Runnable {
	JTextArea ta;
	JTextField tf;
	JScrollPane js;
	Socket s;
	
	PrintWriter pw;
	BufferedReader br;
	String str, str1;
	String nick;
	String ip;

	public void view() {
		ta =new JTextArea();
		tf=new JTextField();
		js=new JScrollPane(ta);
		ta.setBackground(Color.cyan);
		ta.setForeground(Color.red);
		
		add(js,"Center");
		add(tf,"South");
		tf.addActionListener(this);
		setSize(400,300);
		setVisible(true);
		tf.requestFocus();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		go();
		
	}//view
	public void go() {
		try {
			s=new Socket("localhost",5555);
			pw=new PrintWriter(s.getOutputStream(),true);
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		}catch (Exception e) {
			e.getMessage();
		}
		Thread ct=new Thread(this);
		ct.start();
	}//go end
	 public void actionPerformed() {
		 
	 }
	 public void connect() {
			class Connectiong extends JFrame implements ActionListener{
				JTextField nickTF;
				JTextField ipTF;
				JLabel nickL;
				JLabel ipL;
				JButton connect;
				JPanel p;
				
				public Connectiong() {
					nickTF=new JTextField();
					ipTF=new JTextField(20);
					nickL =new JLabel("대화명");//nickTF
					ipL=new JLabel("서버주소");//ipTF
					connect =new JButton("연결");
					
					connect.addActionListener(this);
					p=new JPanel();
					
					p.setLayout(new GridLayout(2, 2) );
					p.add(ipL);
					p.add(ipTF);//ip주소
					p.add(nickL);
					p.add(nickTF);//대화명
					add(p,"Center");
					add(connect,"South");
					
					pack();
					setResizable(false);
					setVisible(true);
					
				}
				
				@Override
				public void actionPerformed(ActionEvent e) {
					nick = nickTF.getText();
					ip=ipTF.getText();
					setVisible(false);
					view();
					
				}
				
			}//connectiong
			new Connectiong();
		};
	public static void main(String[] args) {
		ChatGUIClient cg=new ChatGUIClient();
		cg.connect();

	}
	@Override
	public void run() {
		pw.println(ip+": "+nick);
		try {
			while((str1=br.readLine())!=null) {
				ta.append(str1+'\n');
			}
		}catch (IOException e) {
			e.getMessage();
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		str=tf.getText();
		tf.setText("");
		pw.println(str);
		
	}


}
