package java221104;

class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		
		return "Point("+x+","+y+")";
	}
	
	
	public boolean equals(Point p) {
		// TODO Auto-generated method stub
		if(x==p.x&&y==p.y)
			return true;
		else return false;
	}
	
}

public class ObjectProperty {

	public static void main(String[] args) {
		Point p=new Point(2,3);
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);
		
		Point a=new Point(2,3);
		Point b=new Point(2,3);
		Point c=new Point(3,4);
		System.out.println("----------------------------");
		if(a!=b)
			System.out.println("a!=b");
		
		if(a.equals(b))
			System.out.println("a is equlas to b ");
		
		if(a.equals(c))
			System.out.println("a is equals to c");
		
		String str ="으아악";
		System.out.println(str.toString());
		System.out.println(str);
	}

}
