package day09;

public class test1025 {

	public static void main(String[]args) {
	int aa[][]=new int[5][5];
	for (int i=0;i<aa.length;i++) {
		for(int j=1;j<aa.length+1;j++) {
			System.out.print(j+i);
		}
	
		System.out.println();
}
	System.out.println();
//---------------강사님 답안----------------------------
	int n=1;
	for(int i=0; i<aa.length;i++) {
		for(int j=0; j<aa[i].length;j++) {
			aa[i][j]=n+j;
			System.out.printf("%3d",aa[i][j]);
		}
		n++;
		System.out.println();
	}
		
			
			
		
	}
	
	
	
}
