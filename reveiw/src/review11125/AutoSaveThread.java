package review11125;

public class AutoSaveThread extends Thread{
	void save() {
		System.out.println("작업 내용을 저장함");
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				break;
			}
			save();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
