package CarExample;

public class CarExample {
	public static void main(String[] args) {
		Car car =new Car();
		
		for(int i=1; i<=10; i++) { //Car ��ü�� run() �޼ҵ� 5�� �ݺ�����
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� �ѱ�Ÿ�̾�� ��ü");
				car.frontLeftTire =new HankookTire("�տ���",15);
			case 2:
				System.out.println("�տ����� ��ȣŸ�̾�� ��ü");
				car.frontrightTire =new KumhoTire("�տ�����",15);
			case 3:
				System.out.println("�ڿ��� �ѱ�Ÿ�̾�� ��ü");
				car.backLeftTire =new HankookTire("�ڿ���",15);
			case 4:
				System.out.println("�ڿ����� �ѱ�Ÿ�̾�� ��ü");
				car.backRightTire =new KumhoTire("�ڿ�����",15);
			}
			System.out.println();
		}

	}

}
