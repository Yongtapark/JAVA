package day09;

public class DoubleArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]aa= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		int i,k;
		System.out.printf("aa[0][0]부터 aa[2][3]까지 출력\n");
		for(i=0;i<aa.length;i++) {//행의 길이
			for(int j=0;j<aa[i].length;j++) {//0,1,2...각각의 행의 열의 길이
				System.out.printf("%3d",aa[i][j]);
			}
			System.out.println();
		}
	}

}
