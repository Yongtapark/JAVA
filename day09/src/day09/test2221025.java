package day09;

public class test2221025 {

	public static void main(String[] args) {
		double n=1.0;
		double aa[][]=new double[3][];
		aa[0]=new double[2];
		aa[1]=new double[3];
		aa[2]=new double[2];
		
		for(int i=0; i<aa.length;i++) {
			for(int j=0; j<aa[i].length;j++) {
				
				aa[i][j]=j+n;
				n++;
				System.out.print(aa[i][j]+"\t");
				
			}
			System.out.println();
			
		}

	}

}
