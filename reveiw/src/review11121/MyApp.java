package review11121;

import javax.swing.JFrame;

public class MyApp extends JFrame {
	MyApp(){
		setTitle("이런방식을 추천합니다");
		setSize(300,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MyApp();
		//이런과정은 비추천
//		JFrame f=new JFrame();//JFrame 생성
//		f.setTitle("첫번째프레임");//타이틀 생성
//		f.setSize(300,300);//프레임 사이즈 설정
//		f.setVisible(true);//프레임 화면 표시
		

	}

}
