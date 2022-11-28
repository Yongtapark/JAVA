package review11125;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class test implements ActionListener {

	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[9];
	JButton addButton, subButton, mulButton, divButton, tripleZeroButton;
	JButton decButton, equButton, modButton, clrButton, negButton;
	JPanel panel;

	Font myFont = new Font("", Font.BOLD, 15);

	double num1 = 0, num2 = 0, result = 0;
	char operator;

	test() {
		frame = new JFrame("°è»ê±â");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(340, 400);
		frame.setLayout(null);

		textfield = new JTextField();
		textfield.setBounds(40, 10, 250, 30);
		textfield.setFont(myFont);
		textfield.setEditable(false);

		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		modButton = new JButton("%");
		clrButton = new JButton("C");
		negButton = new JButton("-/+");
		tripleZeroButton = new JButton("000");

		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = modButton;
		functionButtons[7] = clrButton;
		functionButtons[8] = negButton;

		for (int i = 0; i < 9; i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
		}

		for (int i = 0; i < 10; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
		}
		tripleZeroButton = new JButton("000");
		tripleZeroButton.addActionListener(this);
		tripleZeroButton.setFont(myFont);
		tripleZeroButton.setFocusable(false);

		panel = new JPanel();
		panel.setBounds(15, 60, 300, 300);
		panel.setLayout(new GridLayout(5, 4, 5, 5));
		
		panel.add(clrButton);
		panel.add(negButton);
		panel.add(modButton);
		panel.add(divButton);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		panel.add(numberButtons[0]);
		panel.add(tripleZeroButton);
		panel.add(decButton);
		panel.add(equButton);
		
		frame.add(textfield);
		frame.add(panel);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < 10; i++) {
			if (e.getSource() == numberButtons[i]) {
			textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}
		}
		if (e.getSource() == decButton) {
			textfield.setText(textfield.getText().concat("."));
		}
		if (e.getSource() == tripleZeroButton) {
			textfield.setText(textfield.getText().concat("000"));
		}
		if (e.getSource() == addButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '+';
			textfield.setText("");
		}
		if (e.getSource() == subButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '-';
			textfield.setText("");
		}
		if (e.getSource() == mulButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '*';
			textfield.setText("");
		}
		if (e.getSource() == divButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '/';
			textfield.setText("");
		}
		if (e.getSource() == modButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '%';
			textfield.setText("");
		}
		if (e.getSource() == clrButton) {
			textfield.setText("");
		}
		if (e.getSource() == negButton) {
			double temp = Double.parseDouble(textfield.getText());
			temp*=-1;
			textfield.setText(String.valueOf(temp));
		}
		
		if (e.getSource() == equButton) {
			num2 = Double.parseDouble(textfield.getText());

			switch (operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			}
			textfield.setText(String.valueOf(result));
			num1 = result;
		}

	}

}


