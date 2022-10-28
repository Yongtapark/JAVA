package java1027;

public class Samp2 {
	int id;
	public Samp2(int x) {this.id=x;}
	public void set(int x) {this.id=x;}//this.필드=값
	public int get() {return this.id;}
	
	public static void main(String[] args) {
		Samp2 ob1= new Samp2(3);
		Samp2 ob2= new Samp2(4);
		Samp2 s;
		
		s= ob2;
		ob1=ob2;
		
		
		System.out.println("ob1="+ob1.id);
		System.out.println("ob2="+ob2.id);
	
	}

}
