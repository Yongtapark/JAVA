package review11128;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {
	public static void main(String[] args) {
		URL opinion =null;
		URL homePage=null;
		try {
			homePage=new URL("http://hankooki.com:80");//절대경로로 URL 객체 생성
			opinion =new URL(homePage,"opinion/editorial.htm");//상대 경로로 URL객체 생성
		}catch (MalformedURLException e) {
			System.out.println("잘못된 url입니다.");
		}
		System.out.println("protocol="+opinion.getProtocol());//프로토콜 출력
		System.out.println("host="+opinion.getHost());//호스트 이름출력
		System.out.println("port="+opinion.getPort());//포트번호 출력
		System.out.println("path="+opinion.getPath());//경로부분출력
		System.out.println("filename="+opinion.getFile());//파일이름출력

	}

}
