package day09;

public class ArrayLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores= {83,90,87};
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		double avg= (double)sum/scores.length;
		System.out.printf("합계 : %d\n",sum);
		System.out.printf("평균 : %f",avg);
		
		
	}

}
