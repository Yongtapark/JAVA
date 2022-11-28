package review11128;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseIURL2 {

	public static void main(String[] args) {
	URL opinion =null;
	URL homePage =null;
	try {
		homePage=new URL("http://naver.com");//절대 경로로 URL 객체 생성
		opinion=new URL(homePage,"opinion/editorial.ㄴㄷㄹhtm");//상대 경로로 URL 객체 생성
		
	}catch (MalformedURLException e) {
		System.out.println("잘못된 URL입니다.");
	}
	System.out.println("Protocol= "+opinion.getProtocol());//프로토콜 출력
	System.out.println("host ="+opinion.getHost());//호스트 이름 출력
	System.out.println("port ="+opinion.getPort());//포트 번호 출력
	System.out.println("path="+opinion.getPath());//경로 부분 출력
	System.out.println("filename ="+opinion.getFile());//파일 이름 출력
	}

}
