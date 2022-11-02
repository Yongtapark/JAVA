package java221102;

public class SmartPhone extends PDA implements MP3, MobilePhone {
	//메소드 추가
	public void scheduler(){
		System.out.println("일정관리");
	}
	public void applicationManager() {
		System.out.println("응용프로그램 설치/삭제");
	}
	public static void main(String[] args) {
		SmartPhone p=new SmartPhone();
		p.sendCall();
		p.play();
		System.out.println(p.calculate(2, 3));
		p.scheduler();
		p.applicationManager();
		p.stop();
		
		
 
	}

	@Override
	public boolean sendCall() {
		System.out.println("전화 걸기");
		return false;
	}

	@Override
	public boolean receveCall() {
		System.out.println("전화 받기");
		return false;
	}

	@Override
	public boolean sendSMS() {
		System.out.println("문자 송신");
		return false;
	}

	@Override
	public boolean receiveSMS() {
		System.out.println("문자 수신");
		return false;
	}

	@Override
	public void play() {
		System.out.println("재생");
		
	}

	@Override
	public void stop() {
		System.out.println("정지");
		
	}

}
