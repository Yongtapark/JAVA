package java221104;

/*
 * 실제 용량보다(buffer의길이) 항상 16문자가 더 긴 공간을 메모리부터 할당받음
 * 여분 16문자 : 문자열의 일부를 삭제/수정/추가시 필요한 공간
 * 
 * 버퍼란?
 * 데이터를 한 곳에서 다른 한곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는
 * 메모리 영역이다.
 * 버퍼링(buffering)이란 버퍼를 활용하는 방식 또는 버퍼를 채우는 동작을 말한다.
 * 
 * StringBuffer : 내부적으로 직접 변경이 가능한 클래스
 * 				  문자열의 변경이 자주 사용되는 객체일수록 StringBuffer클래스를 사용
 * 				  동기화를 지원함. (정확서을 보장, 속도는 늦어 질 수 있다.)
 * StringBuilder : 동기화를 지원하지 않음 (정확성은 떨어지고, 속도는 빠름)
 * String : 편집되지 않음
 * 			기존의 String객체에 새로운 String값을 더하면 기존의 객체가 수정되는 것이 아니고,
 * 			새로운 객체를 참조하게 됨.
*/
public class StrungVufferExTwo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("1234567890");
		
		//기본 buffer 용량 16바이트(문자)에 입력한 문자열만큼 더한 16+10=26이 됨
		System.out.println("sb의 buffer용량은  : "+sb.capacity());
		System.out.println("sb 문자열의 길이는 : "+sb.length());
		sb.append("ABCDEFGHIJKLMNOPQ");//17
		//버퍼의 기본용량을 모두 소진시 객체 용량이 자동적으로 재설정된다.
		
		//기존의 BUFFER 용량인 26에 2를 더하고 다시 더함 : 26+(26+2) =54
		System.out.println("sb의 buffer 용량은 :"+sb.capacity());
		System.out.println("sb 문자열의 길이는 : "+sb.length());
		System.out.println(sb);
		sb.delete(1, 20);
		System.out.println(sb);
		
		//buffer의 용량은 줄어들지 않음
		System.out.println("sb의 buffer 용량은 :"+sb.capacity());
		System.out.println("sb 문자열의 길이는 : "+sb.length());
		sb.delete(1, 20);

	}

}
