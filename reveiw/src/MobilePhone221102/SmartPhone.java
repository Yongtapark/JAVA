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
		System.out.println("��ȭ�ɱ�");
		return false;
	}

	@Override
	public boolean recieveCall() {
		System.out.println("��ȭ�ޱ�");
		return false;
	}

	@Override
	public boolean sendSMS() {
		System.out.println("���ڼ۽�");
		return false;
	}

	@Override
	public boolean recieveSMS() {
		System.out.println("���ڼ���");
		return false;
	}

	@Override
	public void play() {
		System.out.println("���");
		
	}

	@Override
	public void stop() {
		System.out.println("����");
		
	}

}
