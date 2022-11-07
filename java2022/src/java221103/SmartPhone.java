package java221103;

public class SmartPhone extends Phone{

	SmartPhone(){
		System.out.println("디폴트");
	}
	public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
