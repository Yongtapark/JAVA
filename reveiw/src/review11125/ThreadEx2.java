package review11125;

/*
 * ������ : ���� ���α׷����� OS(VM)�� ���� ȣ��� �� �ִ� �޼ҵ�
 * 		  �ֽ�����:main()�޼ҵ�
 * ���߽����� ȯ�濡���� ��� �����尡 �����ؾ� ���α׷��� ����
 * ������ ������. �������� �ƴ�
*/
public class ThreadEx2 {

	public static void main(String[] args) {
		System.out.println();
		MyThread6 th=new MyThread6();
		th.start();
		
		Thread t2=new Thread(new MyThread61());
		t2.start();
		
		System.out.println("���α׷� ����..");

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