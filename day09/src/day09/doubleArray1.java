package day09;

public class doubleArray1 {
	public static void Q1() {
		int[][] aa=new int[3][4];
		aa[0][0]=1;aa[0][1]=2;aa[0][2]=3;aa[0][3]=4;
		aa[1][0]=5;aa[1][1]=6;aa[1][2]=7;aa[1][3]=8;
		aa[2][0]=9;aa[2][1]=10;aa[2][2]=11;aa[2][3]=12;
		
		System.out.println("aa[0][0]부터 aa[2][3]까지 출력\n");
		
		System.out.printf("%3d %3d %3d %3d\n",aa[0][0],aa[0][1],aa[0][2],aa[0][3]);
		System.out.printf("%3d %3d %3d %3d\n",aa[1][0],aa[1][1],aa[1][2],aa[1][3]);
		System.out.printf("%3d %3d %3d %3d\n",aa[2][0],aa[2][1],aa[2][2],aa[2][3]);
	}
	public static void Q2() {
		System.out.println("sssss");
	}
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int[][] aa=new int[3][4];
		
//		aa[0][0]=1;aa[0][1]=2;aa[0][2]=3;aa[0][3]=4;
//		aa[1][0]=5;aa[1][1]=6;aa[1][2]=7;aa[1][3]=8;
//		aa[2][0]=9;aa[2][1]=10;aa[2][2]=11;aa[2][3]=12;
//		
//		System.out.println("aa[0][0]부터 aa[2][3]까지 출력\n");
//		
//		System.out.printf("%3d %3d %3d %3d\n",aa[0][0],aa[0][1],aa[0][2],aa[0][3]);
//		System.out.printf("%3d %3d %3d %3d\n",aa[1][0],aa[1][1],aa[1][2],aa[1][3]);
//		System.out.printf("%3d %3d %3d %3d\n",aa[2][0],aa[2][1],aa[2][2],aa[2][3]);
	
	
	int row=0,col=0;
	int n=1;
	for(int i[]:aa) {
		col=0;
		for(int j:i) {
			aa[row][col]+=n++;
			System.out.printf("aa[%d][%d]=%2d ",row,col,aa[row][col]);
			col++;
		}
		row++;
		System.out.println();
	}
	
	
//	for(int i=0; i<aa.length;i++) {
//		for(int j=0; j<aa.length;j++) {
//			aa[i][j]=n++;
//		}
//	}
//	System.out.println("aa[0][0]부터 aa[2][3]까지 출력\n");
//	for(int i=0; i<aa.length;i++) {
//		for(int j=0; j<aa[i].length;j++) {
//		System.out.printf("%3d",aa[i][j]);
//		}
//		System.out.println();
//	}
//	
//	//배열 초기화 후 바로 출력
//	n=1;
//	System.out.println("aa[0][0]부터 aa[2][3]까지 출력\n");
//	for(int i=0; i<aa.length;i++) {
//		for(int j=0; j<aa[i].length;j++) {
//			aa[i][j]=n++;
//			System.out.printf("%3d",aa[i][j]);
//		}
//		System.out.println();
//	}
//	//for~each문 1차원
//	//for(int i:1차원 배열명){}
//	
//	
//	//for~each문으로 변경해보기 2차원
//	//for(int i[]:2차원배열명) {
//	//	for(int j:i) {}
//	//}
//	
//	//for~each문으로 변경해보기
//		//for(int i[][]:3차원배열명) {
//		//	for(int j[]:i) {
//	//			for(int k:j){}
//	//}
//		//}
//	System.out.println("------------------");
//
//	for(int i[]:aa) {
//		for(int j:i) {
//			System.out.printf("%3d",j);
//		}
//		System.out.println();
//	}
//	System.out.println();
//	int sum=0;
//	for(int i[]:aa) {
//		for(int j:i) {
//			System.out.printf("%3d",j);
//			sum+=j;
//		}
//		System.out.println();
//	}
//	System.out.println("합계 : "+sum);
	
	Q1();
	Q2();
}
}