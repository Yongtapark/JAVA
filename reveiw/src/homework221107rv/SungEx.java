package homework221107rv;

import java.util.Scanner;

class SungImpl implements Sung {
	int in;// 입력받을 인원수
	Record re[]; // 레코드 갯수

	@Override
	public void set() {
		Scanner sc = new Scanner(System.in);

		System.out.println("인원 수 입력 : ");
		in = sc.nextInt();

		re = new Record[in]; // 인원수만큼의 기록배열 생성
	}

	@Override
	public void intput() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < re.length; i++) {// 기록배열만큼의 크기
			re[i] = new Record();// 기록배열 안에 name/scor/sco/numbel/avg/sum //레코드 안에 이것들을 선언해뒀음
			System.out.printf("%d번째 학생의 학번 이름 입력 (공백구분) : ", i + 1);
			re[i].numbel = sc.nextInt();// 학번입력
			re[i].name = sc.next();// 이름입력
			// ----------------------학번, 이름입력 끝---------------------------------------

			System.out.printf("국어 영어 수학 점수 입력 (공백구분) :");
			re[i].sco[0] = sc.nextInt();// re[i]안에 sco를 초기화해두었기 때문에 가능.
			re[i].sco[1] = sc.nextInt();
			re[i].sco[2] = sc.nextInt();
			// -----------------------점수입력 끝 ---------------------------------------------

			for (int j = 0; j < re[i].sco.length; j++) { // 레코드 안에 있는 과목배열의 길이, 즉 3만큼
				if (re[i].sco[j] >= 90) // i번째 레코드 안의 i번째의 과목의 점수가 90이상일때
					re[i].scor[j] = "수";	// scor[j]의 값은 "수"
				else if (re[i].sco[j] > 80)
					re[i].scor[j] = "우";
				else if (re[i].sco[j] > 70)
					re[i].scor[j] = "미";
				else if (re[i].sco[j] > 60)
					re[i].scor[j] = "양";
				else
					re[i].scor[j] = "가";

			}
			re[i].sum = re[i].sco[0] + re[i].sco[1] + re[i].sco[2];
			re[i].avg = re[i].sum / 3;
			// ------------------------수우미양가 끝--------------------------------

		}
	}

	@Override
	public void print() {
		for (int i = 0; i < re.length; i++) {// 인원수 만큼의 기록배열
			System.out.printf("%5d %5s %3d %3d %3d %3d %3d\n", re[i].numbel, re[i].name, re[i].sco[0], re[i].sco[1],
					re[i].sco[2], re[i].sum, re[i].avg);
			System.out.printf("\t\t%s %s %s\n", re[i].scor[0], re[i].scor[1], re[i].scor[2]);// 수우미양가
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
