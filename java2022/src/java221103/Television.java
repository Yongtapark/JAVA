package java221103;

public class Television implements RemoteControl {
	//필드
	private int volume;
	
	//turnOn() 추상 메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다");
	}
	//turnOff() 추상 메소드의 실체 메소드
	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다.");
		
	}
	//setVolume() 추상 메소드의 실체 메소드
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume =RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume =RemoteControl.MAX_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 tv 볼륨"+volume);
		
	}

}
