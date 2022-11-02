package CarExample;

public class Tire {
	int maxRotation;
	int accumulatedRotation;
	String location;
	
	//생성자
	Tire(String location,int maxRotation){
		this.location =location;
		this.maxRotation=maxRotation;
	}
	boolean roll() {
		++accumulatedRotation; //누적회전수 1증가
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Tire 수명 :"+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+"Tire 펑크 ***");
			return false;
		}
	}
}
