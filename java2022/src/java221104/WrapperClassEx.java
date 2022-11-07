package java221104;

public class WrapperClassEx {

	public static void main(String[] args) {
		Integer i =new Integer(10);//기본형을 객체로 변환
		char c= '4';
		Double d= new Double(3.1234566);//기본형 실수를 객체의 더블로 변환
		System.out.println(Character.toLowerCase('A'));//a 소문자로 변환
		if(Character.isDigit(c))//c에 들어있는 값이 숫자형 문자이면 숫자로 변환해서 가져옴
			System.out.println(Character.getNumericValue(c));//4
		System.out.println(Integer.parseInt("-123"));//-123
		System.out.println(Integer.toBinaryString(28));//11100
		System.out.println(Integer.toHexString(28));
		System.out.println(i.doubleValue());//10.0
		System.out.println(d.toString());//3.1234566
		System.out.println(Double.parseDouble("44.13e-6"));//4.413E-5

		//Wrapper Class : 기본형을 객체로, 객체를 기본형으로 변환하는 클래스
		//1.객체로 변환할 때 		:기본형클래스 객체명	=new 기본형클래스(기본값);
		//2.기본형으로 변환 할 때		:기본형 변수		=객체명.기본형Value();
		//3.기본형으로 변환할 때		:기본형 변수		=기본형클래스.parse기본형("스트링")
		//4.기본형을 스트링으로 변환할 때:String 변수		=기본형클래스.toString();
	}

}
