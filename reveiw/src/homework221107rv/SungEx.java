package homework221107rv;

import java.util.Scanner;

class SungImpl implements Sung {
	int in;// �Է¹��� �ο���
	Record re[]; // ���ڵ� ����

	@Override
	public void set() {
		Scanner sc = new Scanner(System.in);

		System.out.println("�ο� �� �Է� : ");
		in = sc.nextInt();

		re = new Record[in]; // �ο�����ŭ�� ��Ϲ迭 ����
	}

	@Override
	public void intput() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < re.length; i++) {// ��Ϲ迭��ŭ�� ũ��
			re[i] = new Record();// ��Ϲ迭 �ȿ� name/scor/sco/numbel/avg/sum //���ڵ� �ȿ� �̰͵��� �����ص���
			System.out.printf("%d��° �л��� �й� �̸� �Է� (���鱸��) : ", i + 1);
			re[i].numbel = sc.nextInt();// �й��Է�
			re[i].name = sc.next();// �̸��Է�
			// ----------------------�й�, �̸��Է� ��---------------------------------------

			System.out.printf("���� ���� ���� ���� �Է� (���鱸��) :");
			re[i].sco[0] = sc.nextInt();// re[i]�ȿ� sco�� �ʱ�ȭ�صξ��� ������ ����.
			re[i].sco[1] = sc.nextInt();
			re[i].sco[2] = sc.nextInt();
			// -----------------------�����Է� �� ---------------------------------------------

			for (int j = 0; j < re[i].sco.length; j++) { // ���ڵ� �ȿ� �ִ� ����迭�� ����, �� 3��ŭ
				if (re[i].sco[j] >= 90) // i��° ���ڵ� ���� i��°�� ������ ������ 90�̻��϶�
					re[i].scor[j] = "��";	// scor[j]�� ���� "��"
				else if (re[i].sco[j] > 80)
					re[i].scor[j] = "��";
				else if (re[i].sco[j] > 70)
					re[i].scor[j] = "��";
				else if (re[i].sco[j] > 60)
					re[i].scor[j] = "��";
				else
					re[i].scor[j] = "��";

			}
			re[i].sum = re[i].sco[0] + re[i].sco[1] + re[i].sco[2];
			re[i].avg = re[i].sum / 3;
			// ------------------------����̾簡 ��--------------------------------

		}
	}

	@Override
	public void print() {
		for (int i = 0; i < re.length; i++) {// �ο��� ��ŭ�� ��Ϲ迭
			System.out.printf("%5d %5s %3d %3d %3d %3d %3d\n", re[i].numbel, re[i].name, re[i].sco[0], re[i].sco[1],
					re[i].sco[2], re[i].sum, re[i].avg);
			System.out.printf("\t\t%s %s %s\n", re[i].scor[0], re[i].scor[1], re[i].scor[2]);// ����̾簡
		}

	}

}

public class SungEx {

	public static void main(String[] args) {
		SungImpl ob = new SungImpl();
		ob.set();
		ob.intput();
		ob.print();

	}

}
