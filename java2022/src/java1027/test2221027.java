package java1027;

public class test2221027 {

	public static void main(String[] args) {
		int[] a=new int[{1,2,3},{4,5,6}];
		int[] b={6,3,4,5,1,2};
		int[] c=new int[6];
		System.out.println("행렬 a");
		for(int i=0; i<a.length;i++) {
			a[i]=i+1;
			System.out.printf("%2d",a[i]);
			disp(i);
		}
		System.out.println("행렬 b");
		for(int i=0; i<b.length;i++) {
			System.out.printf("%2d",b[i]);
			disp(i);
		}
		System.out.println("행렬 c");
		for(int i=0; i<b.length;i++) {
			c[i]=a[i]+b[i];
			System.out.printf("%2d",c[i]);
			disp(i);
		
		}
	}
	public static void disp(int i) {
		
		if((i+1)%3==0) {
			System.out.println();
		}
	}
}
