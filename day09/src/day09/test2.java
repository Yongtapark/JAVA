package day09;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char test[] =new char[26];

//		
//		for(int i=0;i<test.length;i++) {
//			test[i]=(char)(65+i);
//			
//		}
//		for(int i=0;i<test.length;i++) {
//			
//			System.out.print(test[i]+" ");
//		}
		
	//*---------------------------------------------------
		for (int i=0; i<test.length;i++) {
			test[i]=(char)('a'+i);
		}
		
		for(int i=0;i<test.length;i++) {
			
			System.out.print(test[i]+" ");
		}
		
	}

}
