package java1027;

public class MethodSample {
 public int getSum(int i, int j) {
	 return i+j;
 }
 public int getSum(int i, int j, int k) {
	 return i+j+k;
 }
 public double getSum(double i, double j) {
	 return i+j;
 }
 
	public static void main(String[] args) {
		MethodSample a =new MethodSample();
		int i= a.getSum(1,2);
		
		int j= a.getSum(1,2+3);
		
		int k= a.getSum(1,2);
		
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("k="+k);
//이런식으로 함수명은 같으나 그 ()안의 인자값이 다르게 설정된 것들을 오버로딩이라고 한다.
//메소드 중복OverLoading : 왼쪽은 무관, 메소드 오른쪽에 인자의 갯수, 자료타입, 순서가 모두 달라야 함.
//메소드의 다양성	
//상속과 무관, 상속이 있던, 없던 상관없이 사용할 수 있다.
	}

}
