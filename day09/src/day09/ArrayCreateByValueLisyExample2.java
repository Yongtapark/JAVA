package day09;

public class ArrayCreateByValueLisyExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;
//		scores=new int[] {83,90,87};
//		int sum1 =0;
//		for(int i=0; i<3;i++) {
//			sum1+=scores[i];
//		}
//		System.out.println("총합:"+sum1);
		
		int sum2= add(new int[] {83,90,87});//메소드 호출
		disp(sum2);
	}
//		System.out.println("총합:"+sum2);
//		System.out.println();
		public static void disp	(int sum2) {
			System.out.println("총합:"+sum2);
			System.out.println();
		}
	
// 메소드(x); 호출//  void 메소드 (){return값(X)}
// 메소드(x); 호출//  int 메소드 (){return값(O)}
//	메소드(값); 호출//  void 메소드 (타입 변수){return값(X)}
//	메소드(x); 호출//  int 메소드 (){return값(O)}
//	메소드(O); 호출//  int 메소드 (타입 변수){return값(O)} >> 이것이 현재의 경우
	
		//프로토 타입(메소드 원형)
		public static int add(int[] scores) {
			int sum=0;
			for(int i=0;i<scores.length;i++) {
				sum +=scores[i];
			}
			return sum;
		
			
	}

}
