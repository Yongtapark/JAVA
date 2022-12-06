package firstProject;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame {
	private JTabbedPane tp;
	private AddPane ap;
	private FindPane fp;
	private TotalPane tpa;
	
	public MainFrame() {
		//프레임에 추가될 컴포넌트 초기화
		tp =new JTabbedPane();
		ap =new AddPane();//사원정보입력
		fp = new FindPane();//사원정보조회
		tpa= new TotalPane();//사원전체보기
		
		//탭 추가
		tp.addTab("사원정보입력", ap);
		tp.addTab("사원정보조회", fp);
		tp.addTab("사원전체보기", tpa);
		
		//TabbedPane을 프레임에 추가
		getContentPane().add(tp);
		setTitle("사원 관리 화면");
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MainFrame mainF =new MainFrame();
		mainF.setSize(500,500);

	}

}
