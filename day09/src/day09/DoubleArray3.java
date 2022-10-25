package day09;

import java.util.Scanner;

public class DoubleArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row,col;
		System.out.println("행 개수를 입력");
		row=sc.nextInt();
		System.out.println("열 개수를 입력");
		col=sc.nextInt();

		int aa[][]=new int[row][col];

//		int i[],k[];
//		int val=1;
		//		for(i=0;i<aa.length;i++) {
		//			for(k=0;k<aa[i].length;k++) {
		//				aa[i][k]=val;
		//				val++;
		//				System.out.printf("%2d ",aa[i][k]);
		//			}
		//			System.out.println();
		//		}

		//-----------------------------for each------------------------------
	int a=0,b=0;
	int val=1;
		for(int i[]:aa){
			for(int j:i) {
				aa[a][b]=val++;
				System.out.printf("%2d ",aa[a][b]);
			}
			System.out.println();

		}

	}

}
