package reveiw1103;

public class Telvevison implements RemoteControl {
	private int volume;
	
	public //turnOn() 추상 메소드의 실체 메소드
	void turnOn() {
		System.out.println("tv를 켭니다.");
	}
	
	//turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}
	//setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume =volume;
		}
		System.out.println("현재 TV 볼륨 :"+volume);
	}
}
