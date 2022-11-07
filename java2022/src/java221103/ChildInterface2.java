package java221103;

public interface ChildInterface2 extends ParentInterface{
	
	default void method2(){System.out.println("블라블라블라");}//재정의
	
	void method3();
	
	ChildInterface2 ci2 =new ChildInterface2() {

		@Override
		public void method1() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void method3() {
			// TODO Auto-generated method stub
			
		}
		
	};

}
