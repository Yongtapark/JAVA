package java1027;

public class ArrayPararameter2 {
	 void replaceSpace(char a[]) {
		for(int i=0; i<a.length;i++) {
			if(a[i]==' ') {
				a[i]=',';
			}
		}
	}
	
	 void printCharArray(char a[]) {
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayPararameter2 arr=new ArrayPararameter2();
		//static이 없으면 위처럼 객체를 하나 만들어서 불러와야한다!
		char c[]= {'t','h','i','s',' ','i','s',' ','p','e','n','c','i','l'};
		arr.printCharArray(c);
		arr.replaceSpace(c);
		arr.printCharArray(c);

	}

}
