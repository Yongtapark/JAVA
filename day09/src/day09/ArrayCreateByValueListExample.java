package day09;

import java.util.Scanner;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = new int[3];
		//키보드 3개의 배열값을 받아 처리하세요.
		
		Scanner sc= new Scanner(System.in);
		int  sum = 0;
		double avg = 0;
		
		//;
		for (int i=0; i < score.length; i++) {
			System.out.print(i+1+"번값 :");
			score[i]=sc.nextInt();}
			
			
		
//		for (int j=0; j < score.length; j++) {
//		System.out.println("score["+j+"]="+ score[j]);
//		}
		
		//향상된 for문장=for ~each문으로 변경
		//인덱스를 대신할 수 있는 변수를 정의해야함
	int c=0;
		for(int i :score) {
			sum+=i;//score[c]
			System.out.printf("scores[%d]=%d%n",c++,i);
		}
			
		avg = (double) sum / score.length;	
				
		System.out.printf("총합: %d\n", sum);
		System.out.printf("평균 :%f", avg);
	}


}