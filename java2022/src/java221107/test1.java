package java221107;

public class test1  {
	public static void main(String[]args) {
int [] lotto = {0,0,0,0,0,0};
int i, k,num;
char dupl ='n';

System.out.println("**로또 추첨을 시작합니다.**");

for(i=0; i<6;) {
	num= getnumber();
	for(k=0;k<6;k++) {
		if(lotto[k]==num) {
			dupl='y';
		}
	}
	if(dupl =='n')
		lotto[i++]=num;
	else
		dupl ='n';
}
	System.out.println("추첨된 로또 번호 ==>");
	for (i=0; i<6;i++) {
		System.out.print(lotto[i]+ " ");
	}
}


	public static int getnumber() {
		return (int) (Math.random()*45+1);
	}
}