package review11128;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test01_calculator extends JFrame implements ActionListener {
	private JButton[] numberButton = new JButton[20];
	private JTextField textResult = new JTextField();
	private Container container;
	private String[] number = { "c", "+/-", "%", "/", "7", "8", "9", "x", "4", "5", "6", "-", "1", "2", "3", "+", "0",
			"000", ".", "=" };
	private String strResultNumber;
	private StringBuffer numberBuffer1, numberBuffer2;
	private double calcNumber1, calcNumber2;
	private char operator;

	public test01_calculator() {
		super("계산기");
		strResultNumber = new String();
		numberBuffer1 = new StringBuffer();
		numberBuffer2 = new StringBuffer("0");

		setForm();
		setEvent();
		setSize(300, 350);
		setVisible(true);
	}

	public void setForm() {
		container = this.getContentPane();
		container.setLayout(new BorderLayout(10, 10));

		container.add("North", textResult);

		JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 5, 5));

		for (int i = 0; i < 20; i++) {
			numberButton[i] = new JButton(number[i]);
			buttonPanel.add(numberButton[i]);
		}
		container.add("Center", buttonPanel);
	}

	public void setEvent() {
		for (int i = 0; i < 20; i++) {
			numberButton[i].addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) throws NumberFormatException {
		if (e.getSource() == numberButton[0]) {
			numberBuffer1.delete(0, numberBuffer1.capacity());
			numberBuffer2.delete(0, numberBuffer2.capacity());
			numberBuffer2.append("0");
			calcNumber1 = calcNumber2 = 0;
			strResultNumber = "";
			operator = ' ';
			textResult.setText(strResultNumber);
		} else if (e.getSource() == numberButton[1]) {
		} else if (e.getSource() == numberButton[2]) {
		} else if (e.getSource() == numberButton[3]) {
				//나누기 가능
			operator ='/';
			calcNumber1=Double.parseDouble(numberBuffer1.toString());
			
			if(calcNumber1==0.0) {
				calcNumber1=1.0;
			}
			
			if(calcNumber2==0.0) {
				calcNumber2=1.0;
			}
			
			calcNumber2=calcNumber2/calcNumber2;
			strResultNumber=String.valueOf(calcNumber2);
			textResult.setText(strResultNumber);
			
			numberBuffer1.delete(0, numberBuffer1.capacity());
			
		}else if(e.getSource()==numberButton[4]) {
			strResultNumber =numberBuffer1.append("7").toString();
			textResult.setText(strResultNumber);
		}else if(e.getSource()==numberButton[5]) {
			strResultNumber=numberBuffer1.append("8").toString();
			textResult.setText(strResultNumber);
		}else if(e.getSource()==numberButton[6]) {
			strResultNumber =numberBuffer1.append("9").toString();
			textResult.setText(strResultNumber);
		}else if(e.getSource()==numberButton[7]) {
			//x 곱하기기능
			operator='*';
			calcNumber1 =Double.parseDouble(numberBuffer1.toString());
			
			if(calcNumber1==0.0) {
				calcNumber1=1.0;
			}
			if(calcNumber2==0.0) {
				calcNumber2=1.0;
			}
			
			calcNumber2 =calcNumber2*calcNumber1;
			strResultNumber=String.valueOf(calcNumber2);
			textResult.setText(strResultNumber);
			
			numberBuffer1.delete(0, numberBuffer1.capacity());
		}else if(e.getSource()==numberButton[8]) {
			strResultNumber=numberBuffer1.append("4").toString();
			textResult.setText(strResultNumber);
		}else if(e.getSource()==numberButton[9]) {
			strResultNumber=numberBuffer1.append("5").toString();
			textResult.setText(strResultNumber);
		}else if(e.getSource()==numberButton[10]) {
			strResultNumber=numberBuffer1.append("6").toString();
			textResult.setText(strResultNumber);
		}else if(e.getSource()==numberButton[11]) {
			//빼기 기능
			operator ='-';
			
			calcNumber1=Double.parseDouble(numberBuffer1.toString());
			calcNumber2=calcNumber2-calcNumber1;
			strResultNumber=String.valueOf(calcNumber2);
			textResult.setText(strResultNumber);
			
			numberBuffer1.delete(0, numberBuffer1.capacity());
		}else if(e.getSource()==numberButton[12]) {
			strResultNumber =numberBuffer1.append("1").toString();
			textResult.setText(strResultNumber);
		}else if(e.getSource()==numberButton[13]) {
			strResultNumber =numberBuffer1.append("2").toString();
			textResult.setText(strResultNumber);
		}else if(e.getSource()==numberButton[14]) {
			strResultNumber =numberBuffer1.append("3").toString();
			textResult.setText(strResultNumber);
		}else if(e.getSource()==numberButton[15]) {
			operator='+';
			
			calcNumber1 =Double.parseDouble(numberBuffer1.toString());
			calcNumber2=calcNumber2+calcNumber1;
			strResultNumber = String.valueOf(calcNumber2);
		}

	}

	public static void main(String[] args) {
		new test01_calculator();

	}
}
