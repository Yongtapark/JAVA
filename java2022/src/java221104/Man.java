package java221104;

public class Man implements Person{

	@Override
	public void eat() {
		System.out.println(this.getClass().getSimpleName()+"이 밥을 먹습니다.");
	}
	@Override
	public void poop() {
		System.out.println(this.getClass().getSimpleName()+" 이 화장실을 갑니다.");
	}
	@Override
	public void sleep() {
		System.out.println(this.getClass().getSimpleName()+" 이 잠을 잡니다.");
		
	}
	@Override
	public void thinking() {
		System.out.println(this.getClass().getSimpleName()+" 이 골똘히 생각합니다.");
		
	}

}
