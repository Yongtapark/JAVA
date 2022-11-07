package homework221103;

import java.util.Scanner;

public class middle implements Score{

	@Override
	public void set() {
		
		System.out.print("인원수입력 :\t");
		
		
		
	}

	@Override
	public void intput() {
		Scanner sc = new Scanner(System.in);
		int human = Integer.parseInt(sc.nextLine());
		int[] studentArray = new int[human];// human == studentArray배열 최대 수
		//System.out.println(studentArray.length);
		int matArray[] = new int[human];
		int korArray[] = new int[human];
		int engArray[] = new int[human];
		int studentCodeArray[] = new int[human];
		String studentNameArray[] =new String[human];
		char korGrade[] = new char[human];
		char engGrade[] = new char[human];
		char matGrade[] = new char[human];
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println();
			System.out.print(i + 1 + "번째 학생의 학번 이름 입력 (공백구분):\t");
			int studentCode = Integer.parseInt(sc.next());
			String studentName = sc.next();
			//System.in.skip(2);

			System.out.print("국어 영어 수학 점수 입력 (공백구분):\t");
			int kor = Integer.parseInt(sc.next());
			int eng = Integer.parseInt(sc.next());
			int mat = Integer.parseInt(sc.next());
			
			korArray[i] = kor;
			engArray[i] = eng;
			matArray[i] = mat;
			
			studentCodeArray[i] = studentCode;
			studentNameArray[i]= studentName;
			
		}
	
		
		for (int i = 0; i < studentArray.length; i++) {
			
			
			switch(korArray[i]/10) {
			case 10:
				korGrade[i] ='수';
				break;
			case 9:
				korGrade[i]='수';
				break;
			case 8:
				korGrade[i]='우';
				break;
			case 7:
				korGrade[i]='미';
				break;
			case 6:
				korGrade[i]='양';
				break;
			}
			switch(engArray[i]/10) {
			case 10:
				engGrade[i] ='수';
				break;
			case 9:
				engGrade[i]='수';
				break;
			case 8:
				engGrade[i]='우';
				break;
			case 7:
				engGrade[i]='미';
				break;
			case 6:
				engGrade[i]='양';
				break;
			}
			switch(matArray[i]/10) {
			case 10:
				matGrade[i] ='수';
				break;
			case 9:
				matGrade[i]='수';
				break;
			case 8:
				matGrade[i]='우';
				break;
			case 7:
				matGrade[i]='미';
				break;
			case 6:
				matGrade[i]='양';
				break;
				
			}
			
			
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < studentArray.length; i++) {
			int sum= korArray[i] + engArray[i] + matArray[i];
			System.out.printf("%4d %s\t %4d %4d %4d %4d\n",studentCodeArray[i],studentNameArray[i],korArray[i],engArray[i],matArray[i],sum);
			System.out.printf("\t\t%4c %4c %4c\n",korGrade[i],engGrade[i],matGrade[i]);
		}
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
