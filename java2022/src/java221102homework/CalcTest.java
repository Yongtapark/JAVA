package java221102homework;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		CalcTool ca =new CalcTool();
		
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 1 : ");
		ca.a =Integer.parseInt(sc.nextLine());
		System.out.print("정수 2 : ");
		ca.b =Integer.parseInt(sc.nextLine());
		System.out.print("연산자 : ");
		String result=sc.nextLine();
		switch(result) {
		case "+" :
			System.out.println(ca.a+"+"+ca.b+"="+ca.add(ca.a, ca.b));
			break;
		case "-" :
			System.out.println(ca.a+"-"+ca.b+"="+ca.minus(ca.a, ca.b));
			break;
		case "*" :
			System.out.println(ca.a+"*"+ca.b+"="+ca.gob(ca.a, ca.b));
			break;
		case "/" :
			System.out.println(ca.a+"/"+ca.b+"="+ca.nanu(ca.a, ca.b));
			break;
		}
		
		
		

	}

}
