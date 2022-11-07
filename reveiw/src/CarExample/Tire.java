package CarExample;

public class Tire {
	int maxRotation;
	int accumulatedRotation;
	String location;
	
	//������
	Tire(String location,int maxRotation){
		this.location =location;
		this.maxRotation=maxRotation;
	}
	boolean roll() {
		++accumulatedRotation; //����ȸ���� 1����
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Tire ���� :"+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("***"+location+"Tire ��ũ ***");
			return false;
		}
	}
}
