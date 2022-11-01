package java1028;
class CurrencyConverter{
	int value=0;
	private static double rate;//한국 원화에 대한 환율
	public static double toDollor(double won) {
		return won/rate;//한국원화를 달러로 변환
	}
	//일반 메소드 ==non-static,static(정적=클래스)/non-static(동적=인스턴스)
	public double toDollor2(double won) {
		value=0;
		System.out.println("여기는 일반 메소드");
		return won/rate;//한국원화를 달러로 변환
	}
	//static 메소드,
	public static double toKWR(double dollar) {
		//value=0;//static 멤버만 와야함
		return dollar*rate;//달러를 한국 원화로 변환
	}
	public static void setRate(double r) {
		//this.rate=rate//this 사용 불가
		System.out.println("여기는 스테틱 메소드");
		rate=r;//환율설정/kWR/$1
	}
}

public class StaticMember {
	public static void main(String[] args) {
		CurrencyConverter curr =new CurrencyConverter();
		CurrencyConverter.setRate(1121);//미국 달러 환율 설정
		System.out.println("백만원은"+CurrencyConverter.toDollor(10000000)+"달러입니다.");
		System.out.println("백만원은"+curr.toDollor2(10000000)+"달러입니다.");
		System.out.println("백달러는"+CurrencyConverter.toKWR(100)+"원입니다.");
	}

}
