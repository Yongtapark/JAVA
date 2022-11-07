package java221107;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone =new SmartPhone("구글","안드로이드");
		
		String strObj=myPhone.toString();
		System.out.println(strObj);
		System.out.println(strObj.toString());
		System.out.println(myPhone);

	}

}
