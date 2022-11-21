package review11121;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyCodeEx2 extends JFrame {
	JPanel jp =new JPanel();
	JLabel jl =new JLabel();
	
	KeyCodeEx2(){
		setTitle("keycodeEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		setContentPane(jp);
		jp.requestFocus();
		jp.addKeyListener(new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			//jl.setText(e.getKeyText(e.getKeyCode()));//없어도 실행됨.. 무슨이유로 존재?
			if(e.getKeyChar()=='%') {
				jp.setBackground(Color.blue);
			}else if(e.getKeyCode()==KeyEvent.VK_F1) {
				jp.setBackground(Color.yellow);
			}
		}
		});
	}
	public static void main(String[] args) {
		new KeyCodeEx2();

	}

}
