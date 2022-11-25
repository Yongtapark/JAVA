package review11125;

/*
 * 스레드 활용 : Thread class를 상속받아서 구현하기
 * 스레드 활용 : main 부터 실행되고 sub실행
 * Thread의 종류
 * -User Thread : main 종료와 상관없이 Thread가 계속 실행됨
 * -Daeom Thread: main종료시 Thread 종료 : Daemon :보조스레드 예 gc, 메인을 대신
 *                                    [setDaemon(true)]
 * Thread.activeCount();//현재 실행중인 Thread 개수
 * 스레드의 스케쥴 방식
 * -선점형 스레드 스케줄링 방식: 스레드의 우선권을 가지고 우선순위가 높은 스레드를 먼저 수행시키는 방식.
 * -비선점형 스레드 스케줄링 방식:실행중인 스레드가 CPU 사용권을 다른 스레드에게 넘길때까지 기다리는 방식.
 * JVM은 우선순위에 따른 선점형 스레드 스케쥴링 방식을 사용한다.
 * 우선순위가 빠르다고 해서 먼저 수행되지 않는다.
 * (작업량에 따라 결정됨, 우선순위는 참고일뿐.)
 * 멀티 스레드가 수행될 때 어떤 스레드가 먼저 수행될지는 스레드 스케쥴러가 결정한다.
*/
class ThreadSub extends Thread{
	@Override
	public void run() {
		for(char ch='A';ch<='Z';ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadEx extends Thread{
	
	public static void main(String[] args) {
		ThreadSub ts=new ThreadSub();
		//user Thread-->main의 종료와 무관하게 Thread 계속실행
		//ts.setDaemon(false);//main의 기본값 false
		
		//Daemon Thread--> main이 종료하면 모든 Thread종료
		ts.setDaemon(true); //지우면 알파벳이 계속 나옴
		//실행중인 스레드 갯수
		System.out.println(Thread.activeCount());
		System.out.println("스레드 초기상태 확인"+ts.isDaemon());
		ts.start();
		for(int i=0;i<5;i++) {
			System.out.println("main:"+i);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
