package review11124;
	class ClaclThread extends Thread{
		ClaclThread(String name){
			setName(name);
		}
		@Override
		public void run() {
			for(int i=0; i<2000000000L; i++) {
			}
			System.out.println(getName());
		}
	}
public class PriorityExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			Thread thread=new ClaclThread("thread"+i);
			if(i !=10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {
				thread.setPriority(thread.MAX_PRIORITY);
			}
			thread.start();
		}

	}

}
