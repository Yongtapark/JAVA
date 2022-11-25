package review11125;

/*
 * ������ Ȱ�� : Thread class�� ��ӹ޾Ƽ� �����ϱ�
 * ������ Ȱ�� : main ���� ����ǰ� sub����
 * Thread�� ����
 * -User Thread : main ����� ������� Thread�� ��� �����
 * -Daeom Thread: main����� Thread ���� : Daemon :���������� �� gc, ������ ���
 *                                    [setDaemon(true)]
 * Thread.activeCount();//���� �������� Thread ����
 * �������� ������ ���
 * -������ ������ �����ٸ� ���: �������� �켱���� ������ �켱������ ���� �����带 ���� �����Ű�� ���.
 * -������ ������ �����ٸ� ���:�������� �����尡 CPU ������ �ٸ� �����忡�� �ѱ涧���� ��ٸ��� ���.
 * JVM�� �켱������ ���� ������ ������ �����층 ����� ����Ѵ�.
 * �켱������ �����ٰ� �ؼ� ���� ������� �ʴ´�.
 * (�۾����� ���� ������, �켱������ �����ϻ�.)
 * ��Ƽ �����尡 ����� �� � �����尡 ���� ��������� ������ �����췯�� �����Ѵ�.
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
		//user Thread-->main�� ����� �����ϰ� Thread ��ӽ���
		//ts.setDaemon(false);//main�� �⺻�� false
		
		//Daemon Thread--> main�� �����ϸ� ��� Thread����
		ts.setDaemon(true); //����� ���ĺ��� ��� ����
		//�������� ������ ����
		System.out.println(Thread.activeCount());
		System.out.println("������ �ʱ���� Ȯ��"+ts.isDaemon());
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
