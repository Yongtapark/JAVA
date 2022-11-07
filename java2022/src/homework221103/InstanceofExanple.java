package homework221103;

public class InstanceofExanple {
	static void method1(Parents parent) {
		if(parent instanceof Childs) {
			Childs child = (Childs) parent;
			System.out.println("method1-Child로 변환 성공");
		}else {
			System.out.println("method1 -Child로 변환되지 않음");
		}
	}
	
	static void method2(Parents parent) {
		Childs child=(Childs) parent;
		System.out.println("method2-Child로 변환 성공");
	}
	
	
	public static void main(String[] args) {
		Parents parentA =new Childs();//업캐스팅
		method1(parentA);
		method2(parentA);
		
		Parents parentB=new Parents();
		method1(parentB);
		method2(parentB);//업캐스팅이 x 때문에 다운캐스팅을 할 수 없음. 그래서 #14에서 익셉션남
		

	}

}
