package reveiw1103;

public class Telvevison implements RemoteControl {
	private int volume;
	
	public //turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	void turnOn() {
		System.out.println("tv�� �մϴ�.");
	}
	
	//turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOff() {
		System.out.println("Tv�� ���ϴ�.");
	}
	//setVolume() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume =volume;
		}
		System.out.println("���� TV ���� :"+volume);
	}
}
