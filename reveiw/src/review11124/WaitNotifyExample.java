package review11124;

/*
 * ����ȭ�� ������� ����ȭ ��Ͽ��� �ٸ� �����忡�� ������� �ѱ��� ���Ѵ�.
 * �̿� ���� ����ȭ�� ��Ͽ��� �����尣�� ���(������� �ѱ�)�ϱ� �������� 
 * wait()=�Һ���; , notify()=������, notifyAll() �޼ҵ带 ����ؾ� �Ѵ�.
 * �̷� �޼ҵ带 ����� �� ���� �� ���� Synchronized ��Ͽ��� ����ؾ� �ǹ̰� �ִ�.
 * synchronized ����� �ƴ� ��쿡 ����� ���
 * java.lang.IllegalMonitorsStateException�� �߻��Ѵ�.
*/
class WorkObject {
	synchronized void methodA() {
		System.out.println("ThreadA�� methodA() �۾�����");
		notify();//������� ThreadB�� ����
		try {
			wait();//�ڽ��� �����·� ����
		} catch (InterruptedException e) {

		}
	}

	synchronized void methodB() {
		System.out.println("ThreadB�� methodA() �۾�����");
		notify();//������� ThreadA�� ����
		try {
			wait();//�ڽ��� �����·� ����
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
