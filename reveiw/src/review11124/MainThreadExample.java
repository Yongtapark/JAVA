package review11124;


class Calculator{
	private int memory;
	int getMemry() {
		return memory;
	}
	
	 void setMemory(int memory) {
		 synchronized(this){
		this.memory =memory;
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {};
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
	}}
}
//-----------------------------------------------------------
class User1 extends Thread{
	private Calculator calculator;
	
	void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator =calculator;
	}
	@Override
	public void run() {
		calculator.setMemory(100);
	}
}
//-----------------------------------------------------------
class User2 extends Thread{
	private Calculator calculator;
	
	void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator =calculator;
	}
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
//-----------------------------------------------------------
public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator =new Calculator();
		User1 user1=new User1();
		User2 user2=new User2();
		
		user1.setCalculator(calculator);
		user2.setCalculator(calculator);
		
		user1.start();
		user2.start();
		
			
		

	}

}
