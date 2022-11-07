package java221104;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TokenizerEX {

	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		String s=bf.readLine();
		StringTokenizer sv=new StringTokenizer(s,",");
		while(sv.hasMoreTokens())
			System.out.println(sv.nextToken());
		
	}

}
/*
 * 출력)
 * 파싱할 문자열 입력[컴마 구분] : 다음 토큰을 얻어온다.
 * 
 * 피싱된 문자열 :
 * 다음
 * 토큰을
 * 얻어온다.
 */
