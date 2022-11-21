package review11121;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GridLayoutEx extends JFrame{
	GridLayoutEx(){
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid= new GridLayout(5,2);
		grid.setVgap(5);
		setLayout(grid);//배치관리자 설정
		//레이블 객체 생성
		JLabel jb1=new JLabel("이름",JLabel.CENTER);
		JLabel jb2=new JLabel("학과");
		JLabel jb3=new JLabel("과목");
		JLabel jb4=new JLabel("학번");
		
	
		
		//텍스트 객체 생성
		JTextField jt1=new JTextField("홍길동");
		JTextField jt2=new JTextField("");
		JTextField jt3=new JTextField("");
		JTextField jt4=new JTextField("");
		
		//버튼 객체 생성
		JButton btn1 =new JButton("확인");
		JButton btn2 =new JButton("취소");
		btn1.setFont(new Font("굴림",Font.BOLD,20));
		btn2.setFont(new Font("굴림",Font.BOLD,20));
		
		//프레임 차례 차례 레이블/텍스트 상자 붙이기
		add(jb1); add(jt1);
		add(jb2); add(jt2);
		add(jb3); add(jt3);
		add(jb4); add(jt4);
		add(btn1); add(btn2);
		//이벤트 적용 소스=컴포넌트.이벤트 연결기(addXXListener)(이벤트 처리기(){수행할메소드})
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println(e);
				System.out.println("이름 :"+jt1.getText());
				System.out.println("학번 :"+jt2.getText());
				System.out.println("학과 :"+jt3.getText());
				System.out.println("과목 :"+jt4.getText());
				
			}
		});
		
		//취소를 눌러 칸 비우기
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jt1.setText("");
				jt2.setText("");
				jt3.setText("");
				jt4.setText("");
				
				
			}
		});
		
		//이름에 바탕색 주기/ 그냥 주면 적용안됨, 원래 테이블은 투명한 상태임
		jb1.setOpaque(true);//불투명하게 만들고 색 주기
		jb1.setBackground(Color.blue);
		jb1.setForeground(Color.white);
		
		
		jt1.setBackground(Color.orange);
		jt2.setBackground(Color.orange);
		jt2.setBackground(Color.orange);
		jt2.setBackground(Color.orange);
		
		
		
//		add(new JLabel("이름"));
//		add(new JTextField(""));
//		add(new JLabel("학번"));
//		add(new JTextField(""));
//		add(new JLabel("학과"));
//		add(new JTextField(""));
//		add(new JLabel("과목"));
//		add(new JTextField(""));
		
		setSize(300,200); //프레임 크기조정
		setVisible(true); //프레임 화면에 보이기
	}
	public static void main (String[] args) {
		new GridLayoutEx();
	}

}
