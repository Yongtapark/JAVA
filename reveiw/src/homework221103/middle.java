package homework221103;

import java.util.Scanner;

public class middle implements Score{

	@Override
	public void set() {
		
		System.out.print("�ο����Է� :\t");
		
		
		
	}

	@Override
	public void intput() {
		Scanner sc = new Scanner(System.in);
		int human = Integer.parseInt(sc.nextLine());
		int[] studentArray = new int[human];// human == studentArray�迭 �ִ� ��
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
			System.out.print(i + 1 + "��° �л��� �й� �̸� �Է� (���鱸��):\t");
			int studentCode = Integer.parseInt(sc.next());
			String studentName = sc.next();
			//System.in.skip(2);

			System.out.print("���� ���� ���� ���� �Է� (���鱸��):\t");
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
				korGrade[i] ='��';
				break;
			case 9:
				korGrade[i]='��';
				break;
			case 8:
				korGrade[i]='��';
				break;
			case 7:
				korGrade[i]='��';
				break;
			case 6:
				korGrade[i]='��';
				break;
			}
			switch(engArray[i]/10) {
			case 10:
				engGrade[i] ='��';
				break;
			case 9:
				engGrade[i]='��';
				break;
			case 8:
				engGrade[i]='��';
				break;
			case 7:
				engGrade[i]='��';
				break;
			case 6:
				engGrade[i]='��';
				break;
			}
			switch(matArray[i]/10) {
			case 10:
				matGrade[i] ='��';
				break;
			case 9:
				matGrade[i]='��';
				break;
			case 8:
				matGrade[i]='��';
				break;
			case 7:
				matGrade[i]='��';
				break;
			case 6:
				matGrade[i]='��';
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
