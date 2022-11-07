package java221103;

public interface ChildInterface1 extends ParentInterface {
	public void method3();
	ChildInterface1 ci1=new ChildInterface1() {
		
		@Override
		public void method1() {
			System.out.println("");
			
		}
		
		@Override
		public void method3() {
		
		}
		
	};

}
