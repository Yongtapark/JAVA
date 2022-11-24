package review11124;

/*
 * 동기화된 스레드는 동기화 블록에서 다른 스레드에게 제어권을 넘기지 못한다.
 * 이와 같이 동기화된 블록에서 스레드간의 통신(제어권을 넘김)하기 위에서는 
 * wait()=소비자; , notify()=생산자, notifyAll() 메소드를 사용해야 한다.
 * 이런 메소드를 사용할 때 주의 할 점은 Synchronized 블록에서 사용해야 의미가 있다.
 * synchronized 블록이 아닌 경우에 사용할 경우
 * java.lang.IllegalMonitorsStateException이 발생한다.
*/
class WorkObject {
	synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업실행");
		notify();//대기중인 ThreadB를 깨움
		try {
			wait();//자신은 대기상태로 빠짐
		} catch (InterruptedException e) {

		}
	}

	synchronized void methodB() {
		System.out.println("ThreadB의 methodA() 작업실행");
		notify();//대기중인 ThreadA를 깨움
		try {
			wait();//자신은 대기상태로 빠짐
		} catch (InterruptedException e) {

		}
	}
}
//---------------------------------------------------------------------
	class ThreadAa extends Thread{
		private WorkObject workObject;
		
		ThreadAa(WorkObject workObject){
			this.workObject=workObject;
		}
		
		@Override
		public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
		}
	}
//---------------------------------------------------------------------
	class ThreadBb extends Thread{
		private WorkObject workObject;
		
		ThreadBb(WorkObject workObject){
			this.workObject=workObject;
		}
		
		@Override
		public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodB();
		}
		}
	}
//---------------------------------------------------------------------
public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject sharedObject=new WorkObject();
		
		ThreadAa threadA =new ThreadAa(sharedObject);
		ThreadBb threadB =new ThreadBb(sharedObject);
		
		threadA.start();
		threadB.start();

	}

}
