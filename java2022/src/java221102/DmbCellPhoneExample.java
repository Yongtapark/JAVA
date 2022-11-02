package java221102;

public class DmbCellPhoneExample {
	public static void main(String[]args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","블랙",10);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델 : "+dmbCellPhone.model);
		System.out.println("색상 : "+dmbCellPhone.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널 : "+dmbCellPhone.channel);
		
		//CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요 나야");
		dmbCellPhone.receiveVoice("아~예 반갑습니다.");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		System.out.println(dmbCellPhone);
	}

}
