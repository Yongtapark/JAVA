package reveiw1102;

public class rev3GoodCalc extends rev3Calculator {

	

	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	int suvtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	double average(int[] a) {
		double sum=0;
		for (int i=0; i<a.length;i++) {
			sum+=a[i];
		}
		return sum/a.length;
	}
	
	public static void main(String[] args) {
		rev3Calculator c =new rev3GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.suvtract(2, 3));
		System.out.println(c.average(new int[] {1,2,3}));

	}

}
