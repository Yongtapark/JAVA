package CarExample;

public class Car {
	Tire frontLeftTire =new Tire("�տ���",100);
	Tire frontrightTire =new Tire("�տ�����",100);
	Tire backLeftTire =new Tire("�ڿ���",100);
	Tire backRightTire =new Tire("�ڿ�����",100);
	//������
	
	//�޼ҵ�
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(frontLeftTire.roll()==false) {stop();return 1;};
		if(frontrightTire.roll()==false) {stop();return 2;};
		if(backLeftTire.roll()==false) {stop();return 3;};
		if(backRightTire.roll()==false) {stop();return 4;};
		return 0;
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}

}
