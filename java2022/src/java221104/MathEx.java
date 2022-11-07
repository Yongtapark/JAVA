package java221104;

public class MathEx {

	public static void main(String[] args) {
		double a=-2.78987434;
		//절대값 구하기
		System.out.println(Math.abs(a));//절대값
		System.out.println(Math.ceil(a));//올림
		System.out.println(Math.floor(a));//버림
		System.out.println(Math.sqrt(9.0));
		System.out.println(Math.exp(1.5));
		System.out.println(Math.rint(3.131492));
		
		//[1,45]사이의 난수 발생
		System.out.println("이번주 행운의 번호는");
		for(int i=0; i<5; i++) //round 반올림
			System.out.print(Math.round(1+Math.random()*44)+" ");
		System.out.println("입니다.");
		
	}

}
