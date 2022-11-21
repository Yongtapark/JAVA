package review11121;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListenerAllEx2 extends JFrame {
	JPanel jp=new JPanel();
	JLabel jl;
	MouseListenerAllEx2(){
		setTitle("MouseLisetnerAllEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(jp);
		
		
		jp.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				jl.setText("MousePressed("+e.getX()+","+e.getY()+")");
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				jl.setText("MousePressed("+e.getX()+","+e.getY()+")");
				
			}
		});
		
		jp.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				jl.setText("MousePressed("+e.getX()+","+e.getY()+")");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				jl.setText("MousePressed("+e.getX()+","+e.getY()+")");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				jp.setBackground(Color.orange);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				jp.setBackground(Color.blue);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		jl=new JLabel("no Mouse event");
		jp.add(jl);
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseListenerAllEx2();

	}

}
