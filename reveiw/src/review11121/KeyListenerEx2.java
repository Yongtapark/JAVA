package review11121;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListenerEx2 extends JFrame {
	KeyListenerEx2() {
		
		// TODO Auto-generated constructor stub
		JPanel jp = new JPanel();
		JLabel [] jl;
		setTitle("KeyListenerEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(jp);//요게뭐임
		jl = new JLabel[3];
		jl[0]= new JLabel("getKeyCode()");
		jl[1]= new JLabel("getKeychar()");
		jl[2]= new JLabel("getKeytext()");
		
		for(int i=0; i<jl.length;i++) {
			jp.add(jl[i]);
			jl[i].setOpaque(true);
			jl[i].setBackground(Color.cyan);
		}
		setSize(500, 500);
		setVisible(true);
		jp.requestFocus();//이게 도대체 무슨기능이야!?!?!?
		jp.addKeyListener(new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int keyCode =e.getKeyCode();
			char keychar=e.getKeyChar();
			jl[0].setText(Integer.toString(keyCode));
			jl[1].setText(Integer.toString(keychar));
			jl[2].setText(e.getKeyText(keyCode));
		}
		});

		
	}

	public static void main(String[] args) {
		new KeyListenerEx2();

	}

}
