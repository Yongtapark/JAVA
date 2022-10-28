package java1027;
//2.리턴타입이 있고 매개변수가 있는 메소드
//call by address
public class Mathod_Add_메소드호출2 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[]b={};
		
		b=add(a);
		
		disp(b);
//		for(int i=0; i<b.length;i++) {
//			System.out.println("b["+i+"]="+b[i]);
//			sum+=i;
//		}
//		System.out.println("합계 :"+sum);
		
		Mathod_Add_메소드호출2 m = new Mathod_Add_메소드호출2();
		b=m.add1(a);
		
		m.disp(b);
//		for (int i = 0; i < b.length; i++) {
//			System.out.println("b[" + i + "]=" + b[i]);
//			sum+=i;
//		}

	}
	public static void disp(int b[]) {
		int sum=0;
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "]=" + b[i]);
			sum+=i;	
	}
		System.out.println("합계 : "+sum);
	}
	public static int[] add(int[] a) {//시작주소값 받음
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}
		return a;
	}

	public int[] add1(int[]a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}
		return a;

}}
