package CarExample;

public class KumhoTire extends Tire{

	KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	boolean roll() {
		++accumulatedRotation; //����ȸ���� 1����
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Tire ���� :"+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("***"+location+"KumhoTire ��ũ ***");
			return false;
		}
	}
}
