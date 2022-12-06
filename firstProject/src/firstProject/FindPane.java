package firstProject;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class FindPane extends JPanel implements ActionListener {
	// Swing 관련 멤버
	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];
	private JButton okb;
	private JButton rsb;

	String[] caption = { "사 번:", "이 름 :", "직 책 :", "부 서 :", "메 일 :" };

	public FindPane() {
		setLayout(new GridLayout(7, 1));
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);

		int size = caption.length;
		// 레이블의 길이
		for (int i = 0; i < size; i++) {
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);
			jp[i] = new JPanel();
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			add(jp[i]);
			// 텍스트필드를 입력 불가능한 상태로 만든다.
			tf[i].setEditable(false);
			if (i == 0 || i == 1)
				// 사번과 이름으로 검색해야 입력 가능한 상태로 만든다.
				tf[i].setEditable(true);

		}

		// 사원조회, 다시쓰기 버튼 생성 후 이벤트를 처리, 패널에 붙임
		jp[size] = new JPanel();
		okb = new JButton("사원정보조회");
		okb.addActionListener(this);
		rsb = new JButton("다시쓰기");
		rsb.addActionListener(this);
		jp[size].add(okb);
		jp[size].add(rsb);
		add(jp[size]);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// 이벤트가 발생한 버튼 캡션의 값을 얻어온다.
		String ae_type = ae.getActionCommand();

		EmployeeVO evo = null;// 검색한 사원 정보를 저장할 VO객체 생성
		EmployeeDAO edvo = null;// 디비처리를 위한 DAO객체 생성

		if (ae_type.equals(okb.getText())) {// 사원조회 버튼이 클릭되었을 경우
			try {
				// 디비처리를 위한 DAO객체 생성
				edvo = new EmployeeDAO();
				String sno = tf[0].getText().trim();
				String sname = tf[1].getText().trim();

				// 사번과 이름 입력을 모두 입력했을 경우
				if (!sno.equals("") && !sname.equals("")) {
					int no = Integer.parseInt(sno);
					// 사번 , 이름으로 검색
					evo = edvo.getemEmployeeCheck(no, sname);
					// 사번만 입력했을 경우
				} else if (!sno.equals("") && sname.equals("")) {
					int no = Integer.parseInt(sno);
					// 사번으로 검색
					evo = edvo.getmEmployeeNo(no);
					// 이름만 입력 했을 경우
				} else if (sno.equals("") && !sname.equals(""))
					// 이름으로 검색
					evo = edvo.getmEmployeeName(sname);// String일가능성 농후

			} catch (Exception e) {
				System.out.println("e=[" + e + "]");
			}
			// 해당 사원이 존재한다면
			if (evo != null) {
				// 텍스트 필드를 해당 사원 값으로 초기화
				tf[0].setText(evo.getNo() + "");
				tf[1].setText(evo.getName() + "");
				tf[2].setText(evo.getJobGrade() + "");
				tf[3].setText(evo.getDepartment() + "");
				tf[4].setText(evo.getEmail() + "");

			} else {
				JOptionPane.showMessageDialog(this, "검색실패");
			}
		} else if (ae_type.equals(rsb.getText())) {// 다시쓰기 버튼클릭했을 때

			int size = caption.length;
			// 텍스트 필드를 초기화 한다.
			for (int i = 0; i < size; i++) {
				tf[i].setText("");
			}
		}

	}

}
