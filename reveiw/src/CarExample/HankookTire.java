package CarExample;

public class HankookTire extends Tire{

	HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	boolean roll() {
		++accumulatedRotation; //����ȸ���� 1����
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Tire ���� :"+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("***"+location+"HankookTire ��ũ ***");
			return false;
		}
	}
}
