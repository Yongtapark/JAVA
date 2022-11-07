package homework221103;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent =new Child();
		parent.field1 ="data1";
		parent.method1();
		parent.method2();
		//부모클래스는 부모특성만 사용해야 함.
		//parents.field2="data2;//접근불가
		//parents.method3();
		
		Child child=(Child)parent;
		child.field2 = "yyy";
		child.method3();

	}

}
