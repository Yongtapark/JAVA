package review11123;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * -프로세스		:실행중인 프로그램
 * -멀티프로세스	:두개 이상의 프로세스가 실행되는것을 말함
 * -멀티 테스킹이란 :두개 이상의 프로세스를 실행아여 일을 처리한느것을 말함
 * -멀티 프로세싱 시스템 : 컴퓨터 시스템이 동시에 여러 작업을 수행하는 
 *                    시스템을 말하며, 지정된 시간 동안에 각 프로세스의 실행
 *                    상태저장, 다음 프로세스의 문맥전환을 통해 이루어진다.(처리기 여러개)
 * -문맥전환이란? 실행중인 프로세스의 상태를 보관하고 새로운 프로세스의 상태를 cpu에 적재(로딩)하는 과정
 * -스레드
 * 	스레드란? 프로세스 내에서 실행되는 세부 작업 단위
 * 			서로 다른 프로세스들 간의 전환대신에 단순히 동일 프로세스 내에서 
 *          동시에 실행되는 여러 다른 함수(메소드)들 간의 전환으로 그 개념을 확장한 것이다.
 *          시작점과 진행, 그리고 종료점을 가지는 일련된 하나의 작업흐름
 *          
 *  멀티 스레드란? 하나의 프로세스에서 여러 개의 스레드가 병행적으로 처리되는 것을 말함.
 *              메모리의 스택영역을 스레드 개수 만큼 분할 스택틱, 힙 공유해서 사용
 * -스레드의 생명 주기
 * 스레드는 Thread 객체가 생성되면 생성주기를 갖게 되는데
 * 크게 5가지로 나눈다.
 * 1. new - 스레드가 만들어진 상태
 * 2. Runnable - 스레드 객체가 생성된 후에 start() 메소드를
 *               호출하면 Runnable 상태로 이동하게 된다.
 * 3. Running  - Runnable 상태에서 스레드 스케줄러에 의해 
 *               Running 상태로 이동.
 * 4. Blocked  - 스레드가 다른 특정한 이유로 Running 상태에서
 *               Blocked 상태로 이동.
 * 5. Dead	   - 스레드가 종료되면 그 스레드는 다시 시작 할 수 없게 된다.           
*/
public class ThreadTimerEx extends JFrame{
	ThreadTimerEx(){
		setTitle("ThreadTimerEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel =new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		
		TimerThread th =new TimerThread(timerLabel);
		c.add(timerLabel);
		
		setSize(300,150);
		setVisible(true);
		th.start();
	}
	class TimerThread extends Thread{
		JLabel timerLabel;
		
		public TimerThread(JLabel timerLabel) {
			this.timerLabel =timerLabel;
		}
		//스레드 코드
		//run()이 종료되면 스레드 종료
		@Override
		public void run() {
			int n=0; //타이머 카운트 값
			
			while(true) {
				timerLabel.setText(Integer.toString(n));
				n++;
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					return;
				}
			}
		}
	}
	public static void main(String[] args) {
		new ThreadTimerEx();

	}

}
