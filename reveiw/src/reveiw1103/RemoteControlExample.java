package reveiw1103;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		
		rc=new Telvevison();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		rc=new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		RemoteControl.changeBattery();
	}
	

}
