package review11125;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Q extends JFrame {
	Container contentPane;
	JTextField tf = new JTextField(10);
	private String num = "";
	String mode = "";
	private ArrayList<String> equation = new ArrayList<String>();
	Q() {
		setTitle("문제1 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		JPanel panel = myPanel();
		contentPane.add(tf, BorderLayout.NORTH);
		contentPane.add(panel, BorderLayout.CENTER); 
		setSize(250,200);
		setVisible(true);
	}
	
	JPanel myPanel() {
		String[] item = { "C", "+/-", "%", "/", "7", "8", "9", "X", "4", "5", "6", "-", "1", "2", "3", "+", "0", "000",
				".", "=" };
		JButton jbtn;
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,4,5,5)); 
		for(int i = 0; i < item.length; i++) {
			jbtn = new JButton(item[i]);
			jbtn.addActionListener(new ButtonActionListener());
			panel.add(jbtn);
		}
		
		
		return panel;
	}
	public static void main(String[] args) {
		new Q();
	}
	class ButtonActionListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String operation=e.getActionCommand();
//			System.out.println(select);
			if (operation.equals("C")) {
				tf.setText("");
			//=이 눌렸을 경우 위에 입력된 식을 계산, 계산값이 나오도록 함
			} else if (operation.equals("=")) {
				//밑의 메소드들을 이용하여 계산, 계산식 화면에 값을 띄워줌
				String result = Double.toString(calculate(tf.getText()));
				tf.setText("" + result);
				num = "";
			//나버지 버튼은 눌렀을 때 계산식에 추가됨
			} else {
				tf.setText(tf.getText() + e.getActionCommand());
			}
			
		}
		
	}
	private void fullTextParsing(String inputText) {
		equation.clear();
		
		//계산식의 글자를 하나하나 거쳐감
		for (int i = 0; i < inputText.length(); i++) {
			char ch = inputText.charAt(i);
			
			//연산기호가 나오면 ArrayList에 추가되고 초기화
			if (ch == '-' || ch == '+' || ch == '×' || ch == '÷') {
				//연산기호를 만났다 : 앞은 숫자라는 것을 의미
				//숫자를 ArrayList에 추가
				equation.add(num);
				//num 초기화
				num = "";
				//연산기호를 ArrayList에 추가
				equation.add(ch + "");
			} else {
				//나머지는 그냥 숫자 처리
				num = num + ch;
			}
		}
		//반복문 끝나고 남아있는 숫자값 추가
		equation.add(num);
		//연산자가 있을 때 num을 ArrayList에 추가하는데, 처음에 -가 있으면 ""가 추가되어 에러가 발생함
		//즉 ""을 제거
		equation.remove("");
	}
	
	//계산 기능
		public double calculate(String inputText) {
			fullTextParsing(inputText);
			
			//위의 메소드를 실행하면 ArrayList에 숫자와 연산 기호가 담김
			double prev = 0;
			double current = 0;
			//연산 기호에 대한 처리를 위한 변수
			String mode = "";
			
			//연산자 우선순위 적용
			for (int i = 0; i < equation.size(); i++) {
				String s = equation.get(i);
				
				//연산자가 있을 때마다 mode의 값을 변경
				if (s.equals("+")) {
					mode = "add";
				} else if (s.equals("-")) {
					mode = "sub";
				} else if (s.equals("×")) {
					mode = "mul";
				} else if (s.equals("÷")) {
					mode = "div";
				} else {
					//전에 있던 연산자가 곱셈 혹은 나눗셈이고 현재 인덱스의 값이 숫자일 때 연산 진행
					if ((mode.equals("mul") || mode.equals("div")) && !s.equals("+") && !s.equals("-") && !s.equals("×") && !s.equals("÷")) {
						Double one = Double.parseDouble(equation.get(i - 2));
						Double two = Double.parseDouble(equation.get(i));
						Double result = 0.0;
						
						//mode에 따라서 계산
						if (mode.equals("mul")) {
							result = one * two;
						} else if (mode.equals("div")) {
							result = one / two;
						}
						//result값을 ArrayList에 추가
						equation.add(i + 1, Double.toString(result));
						
						for (int j = 0; j < 3; j++) {
							equation.remove(i - 2);
						}
						
						//예를 들어 3 + 5 x 6에서  3 + 30이 되었으므로 인덱스를 2만큼 되돌아감
						i -= 2;	// 결과값이 생긴 인덱스로 이동
					}
				}
			}	// 곱셈 나눗셈을 먼저 계산한다
			
			//+일경우 add, -일경우 sub
			for (String s : equation) {
				if (s.equals("+")) {
					mode = "add";
				} else if (s.equals("-")) {
					mode = "sub";
				
				//곱셈, 나눗셈 연산 삭제됨
				}  else {
					//숫자일 경우 문자열을 Double로 형변환
					current = Double.parseDouble(s);
					
					//mode값에 따라 처리, prev는 계속 계산값이 갱신됨
					if (mode.equals("add")) {
						prev += current;
					} else if (mode.equals("sub")) {
						prev -= current;
					} else {
						prev = current;
					}
				}
				//소수점 여섯번 째 자리에서 반올림 -> 화면 표시 제한이 있기때문
				prev = Math.round(prev * 100000) / 100000.0;
			}
			//값 반환
			return prev;
		}
}