package java221103;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("정수 1:");
	int a= sc.nextInt();
	System.out.println("정수 2:");
	int b= sc.nextInt();
	
	System.out.println("연산자 :");
	char operator = sc.next().charAt(0);//연산자를 문자로 변환
	switch(operator) {
	case '+' :
		Add add=new Add();
		add.setValue(a, b);
		System.out.println(a+"+"+b+"="+add.calculate());
		break;
	case '-' :
		Substract sub=new Substract();
		sub.setValue(a, b);
		System.out.println(a+"-"+b+"="+sub.calculate());
		break;
	case '*' :
		Mul mul=new Mul();
		mul.setValue(a, b);
		System.out.println(a+"*"+b+"="+mul.calculate());
		break;
	case '/' :
		Div div=new Div();
		div.setValue(a, b);
		System.out.println(a+"+"+b+"="+div.calculate());
		break;
		
	}

	}

}
