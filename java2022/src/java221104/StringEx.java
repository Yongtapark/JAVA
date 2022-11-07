package java221104;

public class StringEx {

	public static void main(String[] args) {
		String a= new String(" abcd");
		String b= new String(",efg");
		//문자열 연결
		a=a.concat(b);
		System.out.println(a);
		
		//공백제거
		a=a.trim();
		System.out.println(a);
		
		//문자열 대치
		a=a.replace("ab", "12");
		System.out.println(a);
		
		//문자열 분리
		String s[] =a.split(",");
		for(int i=0; i<s.length;i++)
			System.out.println("분리된"+i+"번 문자열"+s[i]);
		
		//서브스트링
		a=a.substring(3);
		System.out.println(a);
		
		//문자열의 문자
		char c =a.charAt(2);
		System.out.println(c);
		
		//여러분의 이름을 넣고 출력 해주세요
		String name="홍길동";
		//concat해서 홍길동님 안녕하세요
		String hello =" 안녕하세요";
		name=name.concat(hello);
		System.out.println(name);
		char subname=name.charAt(1);
		System.out.println(subname);
		System.out.println(name.substring(0,3));//시작, 끝-1
		System.out.println(name.indexOf('동'));

		String ss[] =name.split(" ");
		for(int i=0; i<ss.length;i++) {
			System.out.println("ss["+i+"]"+ss[i]);
		}
		String s1="abc";
		String s2="aBC";
		int fact=s1.compareTo(s2);
		if(fact==0)
			System.out.println("같다");
		else if(fact<0)
			System.out.println(s1+"<"+s2);
		else
			System.out.println(s1+">"+s2);
		
		int n=12345678;
		System.out.println(String.format("%,d",n));
		

	}

}
