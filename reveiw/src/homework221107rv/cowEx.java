package homework221107rv;

import java.util.Scanner;


	class cowProtoImpl implements cowProto {
		int ct;// 입력받을 마릿수
		Cow[] rc;// 레코드 갯수

		@Override
		public void set() {
			Scanner sc = new Scanner(System.in);
			System.out.println("마릿 수 입력 :");
			ct = sc.nextInt();

			rc = new Cow[ct];

		}

		@Override
		public void intput() {
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < rc.length; i++) {
				rc[i] = new Cow();// codex,code, weight, grade
				System.out.printf("%d번째 소의 번호표,체중,정액번호 입력 (공백구분) : ", i + 1);
				rc[i].code = sc.nextInt();
				rc[i].weight = sc.nextInt();
				rc[i].seedN = sc.nextInt();

				// --------------------------------------------------
				System.out.println("부, 모, 조상 번호 입력");
				rc[i].codex[0] = sc.nextInt();
				rc[i].codex[1] = sc.nextInt();
				rc[i].codex[2] = sc.nextInt();
				// --------------------------------------
				for (int j = 0; j < rc[i].codex.length; j++) {
					if (rc[i].weight >= 500) 
						rc[i].grade[j] = "UltraPrime"; 
					else if (rc[i].weight > 400)
						rc[i].grade[j] = "SuperPrime";
					else if (rc[i].weight > 300)
						rc[i].grade[j] = "Prime";
					else if (rc[i].weight > 250)
						rc[i].grade[j] = "soso";
					else
						rc[i].grade[j] = "bad";

				}
				// ------------------------------------------------------

			}

		}

		@Override
		public void print() {
			for (int i=0; i<rc.length;i++) {
				System.out.printf("%5d %3d %3d %2d %2d %3d\n",rc[i].code,rc[i].weight,rc[i].seedN,rc[i].codex[0],rc[i].codex[1],rc[i].codex[2]);
				//System.out.printf("%s %s %s %s",rc[i].grade[0],rc[i].grade[1],rc[i].grade[2]);
			}

		}

	}
	public class cowEx {
	public static void main(String[] args) {
		cowProtoImpl go =new cowProtoImpl();
		go.set();
		go.intput();
		go.print();
		

	}

}
