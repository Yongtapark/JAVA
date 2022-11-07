package java221103;

public interface ChildInterface3 extends ParentInterface{
	
	void method2();//추상 메소드로 재선언
	void method3();
	
	ChildInterface3 ci3 =new ChildInterface3() {

		@Override
		public void method1() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void method2() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void method3() {
			// TODO Auto-generated method stub
			
		}
		
	};

}
