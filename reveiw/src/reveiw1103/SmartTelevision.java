package reveiw1103;

public class SmartTelevision implements RemoteControl, Searchable{
	private int volume;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
		
	}
	@Override
	public void turnOn() {
		System.out.println("tv�� �մϴ�.");
		
	}
	@Override
	public void turnOff() {
		System.out.println("Tv�� ���ϴ�.");
		
	}
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("���� Audio ����:"+volume);

}
}