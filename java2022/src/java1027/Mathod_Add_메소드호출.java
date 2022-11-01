package java1027;
//call by address
//1.리턴값이 없고 매개변수도없음
public class Mathod_Add_메소드호출 {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		
		add();//static이 있는경우
		System.out.println();
		Mathod_Add_메소드호출 mat =new Mathod_Add_메소드호출();
		mat.addnon();//non-static인경우
		
	}
	public static void add() {
		int[] a= {1,2,3};
		for(int i=0; i<a.length;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
	}
	public void addnon() {
		int[] a= {1,2,3};
		for(int i=0; i<a.length;i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
	}

}
