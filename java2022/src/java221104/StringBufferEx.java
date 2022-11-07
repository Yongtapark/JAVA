package java221104;



public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb;
		sb= new StringBuffer("This");
		System.out.println(sb.hashCode());
		sb.append(" is pencil"); //문자열 덧붙이기
		System.out.println(sb);
		
		//(int offset(index), String str)
		sb.insert(7, " my");//문자열 삽입
		System.out.println(sb);
		
		//.replace(int start, int end, String str)
		sb.replace(8, 10, "your");//문자열 대치
		System.out.println(sb);
		
		sb.setLength(5); //스트링 버퍼 내 문자열 길이 설정
		
		System.out.println(sb);
		System.out.println(sb.hashCode()); //해쉬코드값이 같다.
		
		sb=new StringBuffer("a");
		System.out.println(sb);
		sb.append(" pencil");
		System.out.println(sb);
		sb.insert(2, "nice");
		System.out.println(sb);
		sb.replace(2, 6, "bad");
		System.out.println(sb);
		sb.delete(0, 2);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		int n = sb.length();
		System.out.println(n);
		char c= sb.charAt(3);
		System.out.println(c);
		

	}

}
