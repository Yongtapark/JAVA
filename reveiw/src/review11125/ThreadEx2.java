package review11125;

/*
 * 스레드 : 단일 프로그램에서 OS(VM)에 의해 호출될 수 있는 메소드
 * 		  주스레드:main()메소드
 * 다중스레드 환경에서는 모든 스레드가 종료해야 프로그램이 종료
 * 메인은 시작점. 종료점이 아님
*/
public class ThreadEx2 {

	public static void main(String[] args) {
		System.out.println();
		MyThread6 th=new MyThread6();
		th.start();
		
		Thread t2=new Thread(new MyThread61());
		t2.start();
		
		System.out.println("프로그램 종료..");

	}

}
class MyThread6 extends Thread{
	@Override
		public void run() {
			for(int i=0; i<=20; i++) {
				System.out.println("i :"+i);
				try {
					Thread.sleep(1000);
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
}

class MyThread61 implements Runnable{
	@Override
	public void run() {
		for(int n=1;n<=20;n++) {
			System.out.println("n: "+n);
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}