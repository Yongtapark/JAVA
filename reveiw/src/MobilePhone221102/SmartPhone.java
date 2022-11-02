package MobilePhone221102;

public class SmartPhone extends PDA implements MP3, MobilePhone {

	public static void main(String[] args) {
		SmartPhone p =new SmartPhone();
		p.sendCall();
		p.play();
		System.out.println(p.Calculate(2, 3));
		p.stop();

	}

	@Override
	public boolean sendCall() {
		System.out.println("전화걸기");
		return false;
	}

	@Override
	public boolean recieveCall() {
		System.out.println("전화받기");
		return false;
	}

	@Override
	public boolean sendSMS() {
		System.out.println("문자송신");
		return false;
	}

	@Override
	public boolean recieveSMS() {
		System.out.println("문자수신");
		return false;
	}

	@Override
	public void play() {
		System.out.println("재생");
		
	}

	@Override
	public void stop() {
		System.out.println("중지");
		
	}

}
