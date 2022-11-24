package review11124;
class SumThread extends Thread{
	private long sum;
	
	long getsum() {
		return sum;
	}
	
	void setsum(long sum) {
		this.sum=sum;
	}
	
	public void run() {
		for(int i=0; i<=100;i++) {
			sum+=i;
		}
	}
}
public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread=new SumThread();
		sumThread.start();
		System.out.println("1~100 гу :"+sumThread.getsum());
		try {
			sumThread.join();
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("1~100 гу :"+sumThread.getsum());
		System.out.println("1~100 гу :"+sumThread.getsum());
	}

}
