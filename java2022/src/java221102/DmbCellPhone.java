package java221102;

public class DmbCellPhone extends CellPhone {
	//필드
	int channel;
	public DmbCellPhone() {
		System.out.println("DmbCellPhone...기본생성자");
	}
	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		super("삼성tv","흰색");
		this.model=model;
		this.color=color;
		this.channel=channel;
		System.out.println("DmbCellPhone... 3개의 인자값 있는 생성자");
	}
	//메소드
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널"+channel +"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 종료합니다.");
	}
	@Override
	public String toString() {
		return "DmbCellPhone";
	}

}
