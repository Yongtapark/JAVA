package CarExample;

public class KumhoTire extends Tire{

	KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	boolean roll() {
		++accumulatedRotation; //누적회전수 1증가
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Tire 수명 :"+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+"KumhoTire 펑크 ***");
			return false;
		}
	}
}
