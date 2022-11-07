package java221104;

class Rect {
	int width;
	int height;

	Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

//	public boolean equals(Rect p) {
//		if (width * height == p.width * p.height)
//			return true;
//		else
//			return false;
//	}
}

public class EqualEx {

	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		if (a.equals(b))
			System.out.println("a is equal to b");
		if (a.equals(c))
			System.out.println("a is equal to c");
		if (b.equals(c))
			System.out.println("b is equal to c");

		System.out.println("------------------------------");
		if (a.equals(b))
			System.out.println("실제 주소가 같아요");
		else
			System.out.println("실제 주소가 달라요");

		if (a == b) {
			System.out.println("주소가 같아요");
		} else
			System.out.println("주소가 달라요");

		System.out.println("a=" + a.hashCode() + ", b=" + b.hashCode());
	}

}
