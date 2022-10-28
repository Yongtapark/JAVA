package java1027;

public class Person2 {
		int age;
	public static void main(String[] args) {
		Person2[]pa;
		pa=new Person2[10];
		for(int i=0; i<pa.length;i++) {
			pa[i]= new Person2();//배열 칸 안에 객체10개를 하나씩 넣음
			pa[i].age=30+i;
		}
		for(int i=0; i<pa.length;i++) {
			System.out.println(pa[i].age+" ");
		}

	}

}
