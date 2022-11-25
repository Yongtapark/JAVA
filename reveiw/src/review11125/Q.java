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
		setTitle("����1 ");
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
			//=�� ������ ��� ���� �Էµ� ���� ���, ��갪�� �������� ��
			} else if (operation.equals("=")) {
				//���� �޼ҵ���� �̿��Ͽ� ���, ���� ȭ�鿡 ���� �����
				String result = Double.toString(calculate(tf.getText()));
				tf.setText("" + result);
				num = "";
			//������ ��ư�� ������ �� ���Ŀ� �߰���
			} else {
				tf.setText(tf.getText() + e.getActionCommand());
			}
			
		}
		
	}
	private void fullTextParsing(String inputText) {
		equation.clear();
		
		//������ ���ڸ� �ϳ��ϳ� ���İ�
		for (int i = 0; i < inputText.length(); i++) {
			char ch = inputText.charAt(i);
			
			//�����ȣ�� ������ ArrayList�� �߰��ǰ� �ʱ�ȭ
			if (ch == '-' || ch == '+' || ch == '��' || ch == '��') {
				//�����ȣ�� ������ : ���� ���ڶ�� ���� �ǹ�
				//���ڸ� ArrayList�� �߰�
				equation.add(num);
				//num �ʱ�ȭ
				num = "";
				//�����ȣ�� ArrayList�� �߰�
				equation.add(ch + "");
			} else {
				//�������� �׳� ���� ó��
				num = num + ch;
			}
		}
		//�ݺ��� ������ �����ִ� ���ڰ� �߰�
		equation.add(num);
		//�����ڰ� ���� �� num�� ArrayList�� �߰��ϴµ�, ó���� -�� ������ ""�� �߰��Ǿ� ������ �߻���
		//�� ""�� ����
		equation.remove("");
	}
	
	//��� ���
		public double calculate(String inputText) {
			fullTextParsing(inputText);
			
			//���� �޼ҵ带 �����ϸ� ArrayList�� ���ڿ� ���� ��ȣ�� ���
			double prev = 0;
			double current = 0;
			//���� ��ȣ�� ���� ó���� ���� ����
			String mode = "";
			
			//������ �켱���� ����
			for (int i = 0; i < equation.size(); i++) {
				String s = equation.get(i);
				
				//�����ڰ� ���� ������ mode�� ���� ����
				if (s.equals("+")) {
					mode = "add";
				} else if (s.equals("-")) {
					mode = "sub";
				} else if (s.equals("��")) {
					mode = "mul";
				} else if (s.equals("��")) {
					mode = "div";
				} else {
					//���� �ִ� �����ڰ� ���� Ȥ�� �������̰� ���� �ε����� ���� ������ �� ���� ����
					if ((mode.equals("mul") || mode.equals("div")) && !s.equals("+") && !s.equals("-") && !s.equals("��") && !s.equals("��")) {
						Double one = Double.parseDouble(equation.get(i - 2));
						Double two = Double.parseDouble(equation.get(i));
						Double result = 0.0;
						
						//mode�� ���� ���
						if (mode.equals("mul")) {
							result = one * two;
						} else if (mode.equals("div")) {
							result = one / two;
						}
						//result���� ArrayList�� �߰�
						equation.add(i + 1, Double.toString(result));
						
						for (int j = 0; j < 3; j++) {
							equation.remove(i - 2);
						}
						
						//���� ��� 3 + 5 x 6����  3 + 30�� �Ǿ����Ƿ� �ε����� 2��ŭ �ǵ��ư�
						i -= 2;	// ������� ���� �ε����� �̵�
					}
				}
			}	// ���� �������� ���� ����Ѵ�
			
			//+�ϰ�� add, -�ϰ�� sub
			for (String s : equation) {
				if (s.equals("+")) {
					mode = "add";
				} else if (s.equals("-")) {
					mode = "sub";
				
				//����, ������ ���� ������
				}  else {
					//������ ��� ���ڿ��� Double�� ����ȯ
					current = Double.parseDouble(s);
					
					//mode���� ���� ó��, prev�� ��� ��갪�� ���ŵ�
					if (mode.equals("add")) {
						prev += current;
					} else if (mode.equals("sub")) {
						prev -= current;
					} else {
						prev = current;
					}
				}
				//�Ҽ��� ������ ° �ڸ����� �ݿø� -> ȭ�� ǥ�� ������ �ֱ⶧��
				prev = Math.round(prev * 100000) / 100000.0;
			}
			//�� ��ȯ
			return prev;
		}
}