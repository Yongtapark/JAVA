package review11124;

public class StatePrintThread extends Thread{
	private Thread targetThread;
	
	StatePrintThread(Thread targetThread){
		this.targetThread =targetThread;
	}
	@Override
	public void run() {
		while(true) {
			Thread.State state =targetThread.getState();
			System.out.println("타겟 스레드 상태 :"+state);
			//생성 사애일 경우 스레드 run 수행
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			//종료 상태일 경우 반복문 종료
			if(state==Thread.State.TERMINATED) {
				break;
			}
			try {
				//0.5초간 일시정지
				Thread.sleep(500);
				
			}catch(Exception e) {
			}
		}
	}
}
